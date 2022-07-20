package com.obss.jss.day2.intface;

public class Circle implements Drawable, Flyable{

    @Override
    public void draw() {
        System.out.println("circle draw impl.");
    }

    @Override
    public void fly() {
        System.out.println("circle fly impl.");
    }

    @Override
    public void clear() {

    }
}
