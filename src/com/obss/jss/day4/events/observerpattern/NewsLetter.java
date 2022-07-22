package com.obss.jss.day4.events.observerpattern;

import java.util.ArrayList;
import java.util.List;

//event source
public class NewsLetter {

    private List<NewsLetterListener> listeners = new ArrayList<>();

    public void addListener(NewsLetterListener subscriber) {
        listeners.add(subscriber);
    }

    public void publishNews() {
        System.out.println("Something new published!");
        News news = new News(1, "Something happened");
        // Notify everybody that may be interested.
        for (NewsLetterListener listener : listeners)
            listener.somethingPublished(news);
    }
}
