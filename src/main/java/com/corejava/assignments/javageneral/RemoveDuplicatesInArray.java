package com.corejava.assignments.javageneral;

import java.util.*;

public class RemoveDuplicatesInArray {

    public static void removeDuplicates(int[] myArray) {
        LinkedHashSet<Integer> mySet = new LinkedHashSet<>() ;
        for(int i=0; i<myArray.length; i++) {
            mySet.add(myArray[i]);
        }
        System.out.println(mySet);
    }

    public static void main(String[] args) {
        int[] myArray = {12 ,12, 34, 56, 23, 34, 78, 12};
        RemoveDuplicatesInArray.removeDuplicates(myArray);
    }
}
