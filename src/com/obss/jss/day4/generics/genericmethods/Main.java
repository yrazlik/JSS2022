package com.obss.jss.day4.generics.genericmethods;

public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);
        
        String s1 = "a";
        String s2 = "a";
       // Integer s3 = 5;
        System.out.println(Util.<String>isEqual(s1, s2));
        
        Integer x = 5, y = 10;
        System.out.println(Util.<Integer>isEqual(x, y));
    }
}
