package com.obss.jss.day2.lab3;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double draw() {
    	System.out.println("inside Circle class draw() method");
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
