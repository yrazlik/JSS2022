package com.obss.jss.day4.generics.lab;

public class Computer extends Product{

    private int width;
    private int height;

    public Computer(int id, double price, int width, int height) {
        super(id, price);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
