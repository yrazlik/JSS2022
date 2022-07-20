package com.obss.jss.day2;

public class FinalParams {

    public static void main(String[] args) {
        increment(5);
    }

    public static int increment(final int num) {
        //num = 4; //compile error
        return num;
    }
}
