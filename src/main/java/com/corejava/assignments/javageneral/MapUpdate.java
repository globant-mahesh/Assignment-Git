package com.corejava.assignments.javageneral;

import java.util.HashMap;
import java.util.Map;

public class MapUpdate {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Apple", 100);
        myMap.put("Banana", 200);
        myMap.put("Orange", 300);
        myMap.put("Apple", 400); //Update the existing key's value
        System.out.println(myMap);
    }
}
