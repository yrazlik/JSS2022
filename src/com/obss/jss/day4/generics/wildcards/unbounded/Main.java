package com.obss.jss.day4.generics.wildcards.unbounded;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("1");
		strings.add("2");
		strings.add("3");
		strings.add("4");

		/*
		 * unsafeAdd(strings, Integer.valueOf(42)); String s = strings.get(0);
		 * System.out.println(s);
		 */

		printList(strings);
		printList2(strings);
	}
	
	public static <T> void printList(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			T t = list.get(i);
			System.out.print(t + " ");
		}
			
		System.out.println();
	}

	public static void printList2(List<?> list) {
		/*for (int i = 0; i < list.size(); i++) {
			? t = list.get(i);
			System.out.print(t + " ");
		}
			
		System.out.println();*/
		
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}

	public <T> void addToBack(List<T> list) {
		list.add(list.remove(0)); // add front element to the back
	}

	public void addToBack2(List<?> list) {
		//You cannot do this with a wildcard because,
		// the wildcard has not been bound to a type parameter
		// list.add(list.remove(0)); // compile error
	}
}
