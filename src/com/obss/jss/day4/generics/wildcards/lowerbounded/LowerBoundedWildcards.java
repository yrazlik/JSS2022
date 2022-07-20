package com.obss.jss.day4.generics.wildcards.lowerbounded;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowerBoundedWildcards {

    public static void main(String[] args) {

        List<Float> list = new ArrayList<>();
        list.add(1.0f);
        list.add(2.5f);
        list.add(3.9f);
        list.add(4f);

        List<Number> numberList = new ArrayList<>();
        numberList.add(9);
        numberList.add(9.4d);
        numberList.add(2.2f);

        List<Object> objectList = new ArrayList<>();
        objectList.add(new Exception("An Exception"));

        Collections.addAll(list, new Float(4.4f));
        Collections.addAll(numberList, new Float(4.4f));
        Collections.addAll(objectList, "h");


        System.out.println(list);
        System.out.println(numberList);
        System.out.println(objectList);
    }
}
