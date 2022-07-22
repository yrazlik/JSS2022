package com.obss.jss.day4.generics.wildcards.upperbounded;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {

    public static void printNames(List<? extends Bird> birds) {
    	for(Bird bird : birds) {
    		System.out.println(bird.getName());
    	}
    }

    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Bird bird = new Bird();
        Sparrow sparrow = new Sparrow();
        Cat cat = new Cat();
        
        List<Bird> birds = new ArrayList<Bird>();
        birds.add(bird);
        printNames(birds);
        
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(animal);
       // printNames(animals); // compile error
        
        List<Sparrow> sparrows = new ArrayList<Sparrow>();
        sparrows.add(sparrow);
        printNames(sparrows);
        
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(cat);
       // printNames(cats); // compile error
        
        

        /*
            https://stackoverflow.com/questions/32421639/can-we-use-wildcards-at-class-level-in-java
            We cannot use Wildcards at the class level.

            Below syntax are not allowed:
            1. class A<?>{}
            2. class A<? extends Number>{}
            3. new ArrayList<?>();
            4. ArrayList<?> al5=new ArrayList<?>();
            5. ArrayList<? extends Number> al9=new ArrayList<?>();

            Allowed are:

            1.ArrayList<?> al=new ArrayList<String>();
            2.ArrayList<?> al2=new ArrayList();
            3.ArrayList<? extends Runnable> al3=new ArrayList();
            4.ArrayList<? super Runnable> al4=new ArrayList();
            5.ArrayList<? super Runnable> al5=new ArrayList<Object>();
            6.ArrayList<? super Runnable> al6=new ArrayList<Runnable>();
            7.ArrayList<? extends Runnable> al7=new ArrayList<Runnable>();
            8.ArrayList<? extends Runnable> al8=new ArrayList<Thread>();
            9.ArrayList<? extends Object> al9=new ArrayList<Double>();

         */
    }
}
