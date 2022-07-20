package com.obss.jss.day2.lab1;

public class Main {

    public static void main(String[] args) {

        Pen pen = new Pen();

        Circle circle = new Circle(10, "red");
        Rectangle rectangle = new Rectangle(10, 20, "blue");

        double areaOfCircle = pen.drawCircle(circle);
        double areaOfRectangle = pen.drawRectangle(rectangle);

        pen.changeColorCircle("orange", circle);
        pen.changeColorRectangle("purple", rectangle);

    }
}
