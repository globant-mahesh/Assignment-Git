package com.corejava.assignments.javageneral;

public class SecondHighest {

    public static int getSecondHighest(int[] myArray) {
        int highest = myArray[0];
        int secondHighest = myArray[1];
        for(int i = 0; i < myArray.length; i++) {
            if(myArray[i] > highest) {
                secondHighest = highest;
                highest = myArray[i];
            } else if (myArray[i] > secondHighest) {
                secondHighest = myArray[i];
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] myArray = {23, 34, 12, 6, 33};
        System.out.println(getSecondHighest(myArray));
    }
}
