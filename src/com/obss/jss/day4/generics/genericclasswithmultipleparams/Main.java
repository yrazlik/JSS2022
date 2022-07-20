package com.obss.jss.day4.generics.genericclasswithmultipleparams;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("a", 1);
        Pair<String, Integer> pair2 = new Pair<>("b", 2);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
