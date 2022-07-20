package com.obss.jss.day2.inheritance;

public class Fish extends Animal {

    public Fish(int age) {
        super(age, null);
        System.out.println("Inside Fish constructor");
    }
    public Fish(int age, String sound) {
        super(age, sound);
        System.out.println("Inside Fish constructor");
    }

    @Override
    public void makeSound() {
        System.out.println("Fish do not make sound");
    }
}
