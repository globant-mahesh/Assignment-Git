package com.corejava.assignments.javageneral;

import java.util.ArrayList;
import java.util.List;

public class ListInsertion {
    public static void main(String[] args) {
        int[] myArray = {98,34,33,-76,-98,0,-12,-96,77,65};
        List<Integer> positiveNums = new ArrayList<>();
        List<Integer> negativeNums = new ArrayList<>();
        for(int i: myArray) {
            if(i >= 0) {
                positiveNums.add(i);
            } else {
                negativeNums.add(i);
            }
        }

        if (negativeNums.size() >= positiveNums.size()) {
            int index = 1;
            for(int i = 0; i< positiveNums.size() && index <= negativeNums.size(); i++) {
                negativeNums.add(index, negativeNums.get(i));
                index += 2;
            }
            System.out.println(negativeNums);
        } else {
            int index = 1;
            for(int i = 0; i< negativeNums.size() && index <= positiveNums.size(); i++) {
                positiveNums.add(index, negativeNums.get(i));
                index += 2;
            }
            System.out.println("Hello" + positiveNums);
        }
    }
}
