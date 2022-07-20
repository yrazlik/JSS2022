package com.obss.jss.day3.strings;

public class StringBufferAndBuilder4 {

    private static final int LOOP_COUNT = 100000;

    public static void main(String[] args) {

        String str = "1";

        long start = System.currentTimeMillis();

        for(int i = 0; i < LOOP_COUNT; i++) {
            str += "1";
        }

        long end = System.currentTimeMillis();
        System.out.println("str.length() is: " + str.length());
        System.out.println("Concatenation with + took " + (end - start) + " milliseconds");

        str = "1";


        start = System.currentTimeMillis();

        // synchronized, thread safe
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i < LOOP_COUNT; i++) {
            sb.append("1");
        }

        end = System.currentTimeMillis();

        System.out.println("sb.toString().length() is: " + sb.toString().length());
        System.out.println("Concatenation with StringBuffer.append() took " + (end - start) + " milliseconds");

        start = System.currentTimeMillis();

        // not synchronized
        StringBuilder sbu = new StringBuilder(str);
        for(int i = 0; i < LOOP_COUNT; i++) {
            sbu.append("1");
        }
        end = System.currentTimeMillis();
        System.out.println("sbu.toString().length() is: " + sbu.toString().length());
        System.out.println("Concatenation with StringBuilder.append() took " + (end - start) + " milliseconds");

    }
}
