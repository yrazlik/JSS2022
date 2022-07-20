package com.obss.jss.day2;

public class Static {
	
	public static final int NUMBER = 5;

	public static void main(String[] args) {
		MotorCycle motor1 = new MotorCycle();
		motor1.speed = 100;
		//NUMBER = 4;
		motor1.color = "blue";
		//Math.PI;
		System.out.println("motor1 speed: " + motor1.speed + " and color: " + motor1.color);
		System.out.println("MotorCycle class speed: " + MotorCycle.speed);
		MotorCycle motor2 = new MotorCycle();
		motor2.speed = 50;
		motor2.color = "red";
		System.out.println("motor1 speed: " + motor1.speed + " and color: " + motor1.color);
		System.out.println("motor2 speed: " + motor2.speed + " and color: " + motor2.color);
		System.out.println("MotorCycle class speed: " + MotorCycle.speed);
		
		MotorCycle.print();
	}
	
	private static class MotorCycle {
		public static double speed;
		public String color;
		
		public static void print() {
			System.out.println("Hello world");
		}
		
	}
}
