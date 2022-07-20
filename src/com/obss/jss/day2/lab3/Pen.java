package com.obss.jss.day2.lab3;

public class Pen {

	public double drawShape(Shape shape) {
		System.out.println("inside Pen class drawShape() method");
		if(shape instanceof Circle) {
			return ((Circle)shape).draw();
		} else if(shape instanceof Rectangle) {
			return ((Rectangle)shape).draw();
		}
		return 0;
	}
	
	public double drawShape2(Shape shape) {
		System.out.println("inside Pen class drawShape2() method");
		return shape.draw();
	}
}
