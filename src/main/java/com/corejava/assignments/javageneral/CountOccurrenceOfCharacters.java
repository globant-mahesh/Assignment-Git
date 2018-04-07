package com.corejava.assignments.javageneral;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfCharacters {
    public static void main(String[] args) {

        String myString = "aa bcdf rgthhh y";

        Map<Character, Integer> myMap = new HashMap<>();
        for (int i =0; i<myString.length(); i++) {
            int count = myMap.get(myString.charAt(i)) == null ? 0: myMap.get(myString.charAt(i));
            myMap.put(myString.charAt(i), ++count);
        }
        System.out.println(myMap);
    }
}
