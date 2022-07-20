package com.obss.jss.day4.generics.wildcards.upperbounded;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {

    public static void squareOfListItems(List<? extends Number> list) {
        double number;
        for (Number num : list){
            number = num.doubleValue();
            System.out.println(number * number);
        }
    }

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(5);
        list.add(2.5f);
        list.add(3.0d);

        //Accept Number and any of its sub types.
        squareOfListItems(list);
        System.out.println("Square of List of Double " +
                "type using squareOfListItems method:");
        squareOfListItems(list);

        /*
            https://stackoverflow.com/questions/32421639/can-we-use-wildcards-at-class-level-in-java
            We cannot use Wildcards at the class level.

            Below syntax are not allowed:
            1. class A<?>{}
            2. class A<? extends Number>{}
            3. new ArrayList<?>();
            4. ArrayList<?> al5=new ArrayList<?>();
            5. ArrayList<? extends Number> al9=new ArrayList<?>();

            Allowed are:

            1.ArrayList<?> al=new ArrayList<String>();
            2.ArrayList<?> al2=new ArrayList();
            3.ArrayList<? extends Runnable> al3=new ArrayList();
            4.ArrayList<? super Runnable> al4=new ArrayList();
            5.ArrayList<? super Runnable> al5=new ArrayList<Object>();
            6.ArrayList<? super Runnable> al6=new ArrayList<Runnable>();
            7.ArrayList<? extends Runnable> al7=new ArrayList<Runnable>();
            8.ArrayList<? extends Runnable> al8=new ArrayList<Thread>();
            9.ArrayList<? extends Object> al9=new ArrayList<Double>();

         */
    }
}
