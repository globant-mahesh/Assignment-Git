package com.corejava.assignments.javageneral;

import java.util.ArrayList;
import java.util.List;

public class CountOccurrenceOfDigit {
    public static int getOccurrence(int rangeMax, int digit) {
        int count = 0;

        List<Integer> digitList = new ArrayList<>();
        for (int i = 0; i < rangeMax; i++) {
            int currentDigit = i;
            while (currentDigit / 10 != 0) {
                digitList.add(currentDigit % 10);
                currentDigit /= 10;
            }
            digitList.add(currentDigit % 10);
        }

        for (int i : digitList) {
            if (i == digit) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getOccurrence(1000, 7));
    }
}
