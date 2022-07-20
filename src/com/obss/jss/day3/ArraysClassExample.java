package com.obss.jss.day3;

import java.util.Arrays;
import java.util.List;

public class ArraysClassExample {

    public static void main(String[] args) {

        String [] names = {"b", "d", "a", "e", "g", "f"};

        String namesStr = Arrays.toString(names);
        System.out.println(namesStr);

        Arrays.sort(names);
        System.out.println("After sorting: ");

        for(String name : names) {
            System.out.println(name);
        }

        List<String> namesList =  Arrays.asList(names);


    }
}
