package com.obss.jss.day3.strings;

public class Immutability2 {

    public static void main(String[] args) {
        String str1 = "str1", str2 = "str2";
        String str3 = str1.concat(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        str1 = str1.concat(str2); // not the same str1 anymore, new string is created, original str1 is freed
        System.out.println(str1);
    }
}
