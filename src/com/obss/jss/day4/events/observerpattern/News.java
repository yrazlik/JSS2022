package com.obss.jss.day4.events.observerpattern;

public class News {

    public int newsId;
    public String newsContent;

    public News(int newsId, String newsContent) {
        this.newsId = newsId;
        this.newsContent = newsContent;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
}
