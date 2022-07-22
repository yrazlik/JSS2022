package com.obss.jss.day4.generics.wildcards.lowerbounded;

import java.util.ArrayList;
import java.util.List;

import com.obss.jss.day4.generics.wildcards.upperbounded.Animal;
import com.obss.jss.day4.generics.wildcards.upperbounded.Bird;
import com.obss.jss.day4.generics.wildcards.upperbounded.Cat;
import com.obss.jss.day4.generics.wildcards.upperbounded.Sparrow;

public class LowerBoundedWildcards {

	public static void printNames(List<? super Bird> list) {
    	// compile error. A supertype of bird does not habve to be a bird type
		/*for(Bird obj : list) {
    		System.out.println(bird.getName());
    	} */
		
		for(Object obj : list) {
    		System.out.println(obj.toString());
    	}
    }

    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.setName("animal");
        Bird bird = new Bird();
        bird.setName("bird");
        Sparrow sparrow = new Sparrow();
        sparrow.setName("sparrow");
        Cat cat = new Cat();
        cat.setName("cat");
        
        List<Bird> birds = new ArrayList<Bird>();
        birds.add(bird);
        printNames(birds);
        
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(animal);
        printNames(animals); 
        
        List<Sparrow> sparrows = new ArrayList<Sparrow>();
        sparrows.add(sparrow);
        //printNames(sparrows); // compile error
        
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(cat);
        //printNames(cats); // compile error
        
    }
}
