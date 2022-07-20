package com.obss.jss.day4.events.observerpattern;

public class Main {

    public static void main(String[] args) {
        NewsLetter newsLetter = new NewsLetter();
        Subscriber subscriber = new Subscriber();
        Subscriber subscriber1 = new Subscriber();
        newsLetter.addListener(subscriber);
        newsLetter.addListener(subscriber1);
        newsLetter.publishNews();
    }
}
