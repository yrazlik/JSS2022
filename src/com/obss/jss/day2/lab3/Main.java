package com.obss.jss.day2.lab3;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(10, "red");
        Shape rectangle = new Rectangle(10, 20, "blue");
        Pen pen = new Pen();

        double areaOfCircle = pen.drawShape(circle);
        System.out.println("areaOfCircle: " + areaOfCircle);
        
        double areaOfRectangle = pen.drawShape(rectangle);
        System.out.println("areaOfRectangle: " + areaOfRectangle);
        
        double areaOfCircle2 = pen.drawShape2(circle);
        System.out.println("areaOfCircle2: " + areaOfCircle2);
        
        double areaOfRectangle2 = pen.drawShape2(rectangle);
        System.out.println("areaOfRectangle2: " + areaOfRectangle2);
        
    }
}
