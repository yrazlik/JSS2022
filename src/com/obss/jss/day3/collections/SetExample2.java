package com.obss.jss.day3.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("s");
        set.add("s");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");

        for(String s : set) {
            System.out.println(s);
        }


        String str = "ssabaabcdefeeg";
        str = removeDuplicateCharacters(str);
        System.out.println(str);


        treeSetExample();
    }

    private static String removeDuplicateCharacters(String str) {
        Set<String> sortedSet = new LinkedHashSet<>(); // new HashSet<> -> no ordering
        for(int i = 0; i < str.length(); i++) {
            String character = str.substring(i, i + 1);
            sortedSet.add(character);
        }

        return String.join("", sortedSet);
    }

    private static void treeSetExample() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("s");
        treeSet.add("b");
        treeSet.add("a");
        treeSet.add("d");
        treeSet.add("a");

        System.out.println(treeSet);
    }
}
