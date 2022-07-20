package com.obss.jss.day4.events.observerpattern;

public class Subscriber implements NewsLetterListener {

    @Override
    public void somethingPublished(News news) {
        System.out.println("Subscriber is reading the news. The news content is " + news.getNewsContent());
    }
}
