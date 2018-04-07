package com.corejava.assignments.javageneral;

public class RemoveRepititiveConsecutiveChars {

    public static void main(String[] args) {
        String myString = "aaaaabbbbbbcdddeffggghhhhh";
        StringBuilder stringBuilder = removeConsecutiveDuplicates(myString);
        System.out.println(stringBuilder.toString());
    }

    private static StringBuilder removeConsecutiveDuplicates(String myString) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (int j = i + 1; j < myString.length(); j++) {
            if (myString.charAt(i) != myString.charAt(j)) {
                stringBuilder.append(myString.charAt(i));
                i = j;
            } else if (j== myString.length()-1 && myString.charAt(i) == myString.charAt(j)){
                stringBuilder.append(myString.charAt(i));
            }
        }
        return stringBuilder;
    }
}
