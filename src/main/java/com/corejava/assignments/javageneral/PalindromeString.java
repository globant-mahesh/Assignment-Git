package com.corejava.assignments.javageneral;

public class PalindromeString {

    public static boolean palindromeChecker(String myString) {
        for(int i = 0; i <= myString.length()/2; i++) {
            if (myString.charAt(i) != myString.charAt(myString.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String thisIsMyString = "Application";
        System.out.println("Is Palindrome?"+ palindromeChecker(thisIsMyString));

        thisIsMyString = "nittin";
        System.out.println("Is Palindrome?"+ palindromeChecker(thisIsMyString));
    }
}
