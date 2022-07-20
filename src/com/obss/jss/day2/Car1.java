package com.obss.jss.day2;

public class Car1 {

	private String color;
	private int speed;
	
	//com.obss.jss.day2.abstractclass.AbstractMain main;

	public Car1() {

	}

	public Car1(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelerate() {
		speed += 5;
	}

	public static void main(String[] args) {
		Car1 car = new Car1();
		car.setColor("blue");
		car.setSpeed(90);
		System.out.println("Car color is: " + car.getColor() + " and speed is: " + car.getSpeed());
	
		
	}
	
	public int multiply(int x, int y) {
		return x*y;
	}
	
	public String multiply(int x, int y, int z) {
		return "5";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car1) {
			Car1 carObj = (Car1) obj;
			return carObj.getColor().equals(this.getColor()) 
					&& carObj.getSpeed() == this.getSpeed();
		}
		return false;
	}
}
