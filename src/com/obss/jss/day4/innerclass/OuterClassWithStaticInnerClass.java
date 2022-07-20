package com.obss.jss.day4.innerclass;

public class OuterClassWithStaticInnerClass {

    private InnerStaticClass innerStaticClass;
    private int num = 1;
    private static int staticNum = 2;

    static class InnerStaticClass {

        public void print() {
            System.out.println(staticNum);
            // System.out.println(num); // compile error
        }
    }
}
