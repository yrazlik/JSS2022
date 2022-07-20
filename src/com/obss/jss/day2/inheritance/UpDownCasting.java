package com.obss.jss.day2.inheritance;

public class UpDownCasting {

    public static void main(String[] args) {

        // upcasting
        Cat cat = new Cat(1, "meow");
        Animal animal = cat; // same as Animal animal = (Animal)cat;
        Animal animal2 = new Animal(5, "moo");
        Animal fish = new Fish(2, "");

        // downcasting
        try {
            Cat cat3 = (Cat) animal;
            System.out.println("animal is cast to Cat and assigned to cat3");
        } catch (Exception e) {
            System.out.println("Cannot cast animal to Cat");
        }

        try {
            if(animal2 instanceof Cat) {
                Cat cat4 = (Cat) animal2;
                System.out.println("animal2 is cast to Cat and assigned to cat4");
            } else {
            	System.out.println("Cannot cast animal2 to Cat because animal2 is not of type Cat");
            }
        } catch (Exception e) {
            System.out.println("Cannot cast animal2 to Cat. Exception is: " + e.toString());
        }

        try {
            Cat cat5 = (Cat) fish;
            System.out.println("fish is cast to Cat and assigned to cat5");
        } catch (Exception e) {
            System.out.println("Cannot cast fish to Cat. Exception is: " + e.toString());
        }


        if(animal instanceof Cat) {
            System.out.println("animal is Cat");
        }

        if(fish instanceof Cat) {
            System.out.println("fish is Cat");
        } else {
            System.out.println("fish is not Cat");
        }

        if(fish instanceof Fish) {
            System.out.println("fish is Fish");
        }

        if(fish instanceof Animal) {
            System.out.println("fish is animal");
        }


    }
}
