import java.io.IOException;
import java.util.ArrayList;

public class WebPage {
	public String url;
	public String name;
	public WordCounter counter;
	public Keyword keyword;
	public double score;
	
	public WebPage(String url, String name){
		this.url = url;
		this.name = name;
		this.counter = new WordCounter(url);	
		this.keyword = new Keyword();
	}
	
	public void setScore(int christmasCount,int eventCount,int socialMediaCount,int minusCount) throws IOException{
		score = Math.log(2 * (eventCount * socialMediaCount)) - 2 * minusCount; 
		
	}	
}