package com.obss.jss.day2.inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
	


	public static void main(String[] args) {
	

		Animal cat = new Cat(2, "meow");
		//Cat cat2 = new Cat(2, "qwe");
		Animal fish = new Fish(1);
		System.out.println(fish.toString());

		System.out.println("Cat toString is: " + cat);
		System.out.println("Fish toString is: " + fish);

		cat.makeSound();
		fish.makeSound();

		cat.makeDifferentSound();
		fish.makeDifferentSound();

		Cat cat2 = new Cat(4, "meow");
		cat2.makeCatSound();
		
		// cat.makeCatSound(); // compile error
		((Cat) cat).makeCatSound();
	}
}
