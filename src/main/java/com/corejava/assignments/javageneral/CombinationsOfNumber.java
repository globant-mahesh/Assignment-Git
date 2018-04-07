package com.corejava.assignments.javageneral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationsOfNumber {


    public static void main(String[] args) {
        int num = 123;
        List<Integer> myList = new ArrayList<>();
        while(num/10 != 0) {
            myList.add(num%10);
            num /= 10;
        }
        myList.add(num);
        System.out.println(myList);
        Integer[] myArray = myList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(myArray));
//        printCombination(myArray);
    }

    public static void printCombination() {

    }
}
