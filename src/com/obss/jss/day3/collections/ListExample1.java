package com.obss.jss.day3.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for(int i : list) {
            System.out.println(i);
        }

        System.out.println(list.contains(1));

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(5);

        for(int i : linkedList) {
            System.out.println(i);
        }
    }
}
