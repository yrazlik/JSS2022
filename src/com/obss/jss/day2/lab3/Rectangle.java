package com.obss.jss.day2.lab3;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
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

    @Override
    public double draw() {
    	System.out.println("inside Rectangle class draw() method");
        return this.getWidth() * this.getHeight();
    }
}
