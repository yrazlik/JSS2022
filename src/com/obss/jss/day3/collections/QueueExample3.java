package com.obss.jss.day3.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample3 {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(8);
        queue.add(1);
        queue.add(4);
        queue.add(2);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue);
        
        
    }
    
    
}
