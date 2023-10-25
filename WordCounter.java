
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

public class WordCounter {
	private String urlStr;
	private String content;

	public WordCounter(String urlStr) {
		this.urlStr = urlStr;
	}

	private String fetchContent() throws IOException {
		URL url = new URL(this.urlStr);
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String retVal = "";

		String line = null;

		while ((line = br.readLine()) != null) {
			retVal = retVal + line + "\n";
		}

		return retVal;
	}

	public int BoyerMoore(String T, String P) {
		int n = T.length();
		int m = P.length();
		int i = m - 1;
		int j = m - 1;
		while (i < n) {
			if (T.charAt(i) == P.charAt(j)) {
				if (j == 0) {
					return i;
				} else {
					i--;
					j--;
				}
			} else {
				int lastOccurrence = last(T.charAt(i), P);
				i = i + m - Math.min(j, 1 + lastOccurrence);
				j = m - 1;
			}

		}
		return -1;
	}

	public int last(char c, String P) {
		int lastOccurrence = -1; // Initialize all characters as not found
		for (int i = 0; i < P.length(); i++) {
			if (P.charAt(i) == c) {
				lastOccurrence = i;
			}
		}

		return lastOccurrence;
	}

	public int countKeyword(String keyword) throws IOException {
		if (content == null) {
			content = fetchContent();
		}
		// To do a case-insensitive search, we turn the whole content and keyword into
		// upper-case:
		content = content.toUpperCase();
		keyword = keyword.toUpperCase();

		int retVal = 0;
		int index = BoyerMoore(content, keyword);
		while (index != -1) {
	        retVal++;
	        content = content.substring(index + 1);
	        index = BoyerMoore(content, keyword);
	    }

		return retVal;
	}
}


