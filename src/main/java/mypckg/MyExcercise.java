package mypckg;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyExcercise {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        IntStream.range(0,myArray.length).filter(i -> i%2 == 0).forEach((i) -> System.out.println(myArray[i]));

        for (int i=0; i <myArray.length; i++) {
            if((i+1)%2 == 1) {
                System.out.println(myArray[i]);//10
            }
        }
        for (int i=0; i <myArray.length; i=i+2) {
                System.out.println(myArray[i]);
        }
    }
}
