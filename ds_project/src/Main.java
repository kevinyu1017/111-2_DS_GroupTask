
import java.io.IOException;
import java.util.ArrayList;

//import javax.net.ssl.HostnameVerifier;
//import javax.net.ssl.HttpsURLConnection;
//import javax.net.ssl.SSLSession;

public class Main {
	public static void main(String[] args) throws IOException {
		//root node
		WebPage rootPage = new WebPage("https://www.welcometw.com/%E8%81%96%E8%AA%95%E7%AF%80%E6%B4%BB%E5%8B%95%E6%87%B6%E4%BA%BA%E5%8C%85/#%E5%B1%8F%E6%9D%B1%E8%81%96%E8%AA%95%E7%AF%80%E6%B4%BB%E5%8B%95", "全台活動");		
		WebTree tree = new WebTree(rootPage);
		
		//build childnode
		tree.root.addChild(new WebNode(new WebPage("https://www.welcometw.com/%e4%b8%ad%e5%b1%b1%e7%ab%99%e7%be%8e%e9%a3%9f%e9%a4%90%e5%bb%b3/","台北")));
		tree.root.addChild(new WebNode(new WebPage("https://www.welcometw.com/%E6%96%B0%E5%8C%97%E6%99%AF%E9%BB%9E%E6%8E%A8%E8%96%A6-%E7%86%B1%E9%96%80%E4%B8%BB%E9%A1%8C%E6%99%AF%E9%BB%9E%E3%80%81%E4%BA%BA%E6%B0%A3%E8%B7%AF%E7%B7%9A%E3%80%81ig%E6%89%93%E5%8D%A1%E7%A5%95/","新北")));
		
		Keyword keywords = new Keyword(); 
		tree.setPostOrderScore(keywords);
		tree.eularPrintTree();
		
		
	}
}