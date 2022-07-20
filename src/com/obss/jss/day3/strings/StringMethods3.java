package com.obss.jss.day3.strings;

import java.util.Locale;

public class StringMethods3 {

    public static void main(String[] args) {

        String str = " a,b,  c,d,e,f ";
        String str2 = " A,b,  C,D,e,F ";

        System.out.println("Character a 1st index is: " + str.charAt(1));
        System.out.println("str.equals(str2): " + (str.equals(str2)));
        System.out.println("str.equalsIgnoreCase(str2): " + (str.equalsIgnoreCase(str2)));
        System.out.println("str.length() is: " + str.length());
        System.out.println(str.replace(",", ";"));
        System.out.println("str.substring(0,3): " + str.substring(0, 3));
        System.out.println("toLowerCase of str2: " + str2.toLowerCase());
        System.out.println("toUpperCase of str: " + str.toUpperCase());
        String [] strArr = str.split(",");
        System.out.println("str trimmed: " + str.trim());


    }
}
