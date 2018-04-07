package com.corejava.assignments.javageneral;

public class ArrayExample {
    public static void main(String[] args) {
        String myString = "abcd";
        StringBuilder str = new StringBuilder();
        for(int i =0; i<myString.length(); i++) {
            for (int j=i+1; j<myString.length(); j++) {
                str.append(myString.charAt(i)).append(myString.charAt(j)).append(" ");
            }
        }
        String sub = str.toString();
        System.out.println(sub);
    }
}
