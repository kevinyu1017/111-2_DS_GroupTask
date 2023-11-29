import java.util.ArrayList;

public class Keyword {
    public ArrayList<String> christmasKeywords;
    public ArrayList<String> eventKeywords;
    public ArrayList<String> socialMediaKeywords;
    public ArrayList<String> minusKeywords;

    public Keyword() {
        this.christmasKeywords = new ArrayList<>();
        this.eventKeywords = new ArrayList<>();
        this.socialMediaKeywords = new ArrayList<>();
        this.minusKeywords = new ArrayList<>();
        
        // Initialize the keyword lists
        initializeKeywords();
    }
    public ArrayList<String> getChristmasKeywords(){
    	return christmasKeywords;
    }
    public ArrayList<String> getEventKeywords(){
    	return eventKeywords;
    }
    public ArrayList<String> getSocialMediaKeywords(){
    	return socialMediaKeywords;
    }
    public ArrayList<String> getMinusKeywords(){
    	return minusKeywords;
    }
    private void initializeKeywords() {
        
        christmasKeywords.add("聖誕");
        christmasKeywords.add("耶誕");
        christmasKeywords.add("聖誕節");
        christmasKeywords.add("耶誕節");

        eventKeywords.add("薑餅");
        eventKeywords.add("熱紅酒");
        eventKeywords.add("聖誕樹");
        eventKeywords.add("全台");
        eventKeywords.add("台灣");
        eventKeywords.add("景點");

        socialMediaKeywords.add("懶人包");
        socialMediaKeywords.add("必去");
        socialMediaKeywords.add("打卡");
        socialMediaKeywords.add("一次看");
        socialMediaKeywords.add("2023");

        minusKeywords.add("日本");
        minusKeywords.add("故事");
        minusKeywords.add("習俗");
        minusKeywords.add("由來");
        minusKeywords.add("基督教");
        minusKeywords.add("佈置");
        minusKeywords.add("卡片");
        minusKeywords.add("交換");
        minusKeywords.add("禮物");
        minusKeywords.add("遊戲");
    }

}
