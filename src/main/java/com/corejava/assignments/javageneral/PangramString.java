package com.corejava.assignments.javageneral;

import java.util.LinkedHashSet;

public class PangramString {

    public static boolean isPangram(String myString) {
        LinkedHashSet mySet = new LinkedHashSet();

        for (int i = 0; i < myString.length(); i++) {
            if(Character.isLetter(myString.toLowerCase().charAt(i))) {
                mySet.add(myString.toLowerCase().charAt(i));
            }
        }

        if (mySet.stream().count() == 26) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String myString = "abCdefghijKlmno pqrsTuvwxyz!@#$%^&*()_+";
        System.out.println(isPangram(myString));
    }
}
