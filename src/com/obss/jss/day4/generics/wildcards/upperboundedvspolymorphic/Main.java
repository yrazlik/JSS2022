package com.obss.jss.day4.generics.wildcards.upperboundedvspolymorphic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // both print methods will compile to same bytecode

    public static void printObjects(List<? extends Animal> list) {
        //...
    }

    public static void printObjects2(List<Animal> list) {
        //...
    }

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        printObjects(cats);
        //printObjects2(cats);
    }
}
