package com.obss.jss.day2.abstractclass;

public class AbstractMain {

    public static void main(String[] args) {

    	// abstract classes cannot be instantiated.
    	// you are not creating the instance of your abstract class here. 
    	// rather you are creating an instance of an anonymous subclass of your abstract class. 
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void sort() {
                System.out.println("anonymous class sort impl.");
            }
        };

        abstractClass.sort();

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.sort();
    }
}
