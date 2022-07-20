package com.obss.jss.day2;

public class InstantiatingClasses4 {

    public static void main(String[] args) {
        Car1 car = new Car1("red", 90);

        Car1 otherCar = car;

        System.out.println("Car == otherCar: " + (car == otherCar));

        System.out.println("\n********\n");
        car.setColor("blue");

        System.out.println("Color of car is: " + car.getColor());
        System.out.println("Color of otherCar is: " + otherCar.getColor());
        System.out.println("\n********\n");
        
        car = new Car1("orange", 100);

        System.out.println("Color of car is: " + car.getColor());
        System.out.println("Color of anotherCar is: " + otherCar.getColor());
        System.out.println("\n********\n");
        
		otherCar = new Car1("orange", 100);
		System.out.println("car equals otherCar: " + (car.equals(otherCar)));
		
		Car1 anotherCar = new Car1("red", 90);
		System.out.println("car equals anotherCar: " + (car.equals(anotherCar)));
    }
}
