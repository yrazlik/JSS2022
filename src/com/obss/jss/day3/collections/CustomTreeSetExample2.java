package com.obss.jss.day3.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomTreeSetExample2 {

    public static void main(String[] args) {
        Person p1 = new Person(3);
        Person p2 = new Person(10);
        Person p3 = new Person(2);
        Person p4 = new Person(30);
        Person p5 = new Person(5);
        Person p6 = new Person(5);

        Set<Person> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);

        //System.out.println(set);
        
        Set<String> strSet = new HashSet<String>();
        strSet.add("a");
        strSet.add("a");
        strSet.add("b");
        strSet.add("c");
        
        System.out.println(strSet);
    }
}
