package com.corejava.assignments.javageneral;

public class RemoveWhiteSpacesFromString {
    public static String removeWhiteSpaces(String myString) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) != ' ') {
                stringBuilder.append(myString.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String myString = "this i  s my      string";
        System.out.println(removeWhiteSpaces(myString));
    }
}
