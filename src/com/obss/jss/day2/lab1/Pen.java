package com.obss.jss.day2.lab1;

public class Pen {

    public double drawRectangle(Rectangle r) {
        return r.getWidth() * r.getHeight();
    }

    public double drawCircle(Circle c) {
        return Math.PI * c.getRadius() * c.getRadius();
    }

    public void changeColorRectangle(String color, Rectangle r) {
        r.setColor(color);
    }

    public void changeColorCircle(String color, Circle c) {
        c.setColor(color);
    }
}
