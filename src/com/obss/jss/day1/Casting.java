package com.obss.jss.day1;

public class Casting {

    public static void main(String[] args) {

        double d1 = 10.8;
        double d2 = 11.8;

        int sum1 = (int)d1 + (int)d2;
        int sum2 = (int) (d1 + d2);

       // System.out.println("Sum1: " + sum1);
       // System.out.println("Sum2: " + sum2);

        short s1 = 5, s2 = 6;
        int sum3 = s1 + s2;

        int i1 = 127;
        int i2 = 127;

        byte sum4 = (byte) (i1 + i2);// (byte)i1 + (byte)(i2);
        System.out.println(sum4);


        byte b1 = 12, b2 = 13;
        //byte b3 = (b1 + b2); // compile error
        byte b3 = (byte)(b1 + b2);
        byte b4 = 12 + 13;

    }
}
