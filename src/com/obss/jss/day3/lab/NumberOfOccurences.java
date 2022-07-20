package com.obss.jss.day3.lab;

import java.util.Map;
import java.util.TreeMap;

public class NumberOfOccurences {

    public static void main(String[] args) {

        String str = "veli ayse ali ali veli veli ali ayse ayse ali veli";

        String [] arr = str.split(" ");

        Map<String, Integer> wordsMap = new TreeMap<>();

        for(String word : arr) {
            if(wordsMap.containsKey(word)) {
                int numOfOccurences = wordsMap.get(word);
                wordsMap.put(word, ++numOfOccurences);
            } else {
                wordsMap.put(word, 1);
            }
        }

        System.out.println(wordsMap);
    }
}
