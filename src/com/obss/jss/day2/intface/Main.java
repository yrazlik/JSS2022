package com.obss.jss.day2.intface;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.fly();
		
		Drawable circle2 = new Circle();
		((Circle)circle2).fly();
		((Flyable) circle2).fly();
		
		Shape circle3 = new Circle();
		circle3.clear();
		
		((Drawable) circle).draw();
		
		Drawable drawable = new Drawable() {
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
