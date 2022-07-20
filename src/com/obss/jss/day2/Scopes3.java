package com.obss.jss.day2;

public class Scopes3 {

    public static void main(String[] args) {

        int x = 5;

        for(int i = 0; i < 10; i++) {
            int y = i;
            System.out.println(y + x);
        }

        //y = 5; // compile error
        //System.out.println(i); // compile error

        if(x == 5) {
            int z = 10;
        }

        // z = 11; // compile error
    }
}
