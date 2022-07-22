package com.obss.jss.day4.generics.lab;

public class Computer extends Electronics{

    private int width;
    private int height;

    public Computer(String name, int id, double price, int width, int height) {
        super(name, id, price);
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
