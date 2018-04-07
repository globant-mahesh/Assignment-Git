package com.corejava.assignments.javageneral;

public class ComparisonOfCharactersOnly {
    public static boolean isEqual(String str1, String str2) {
        String processedString1 = processString(str1);
        String processedString2 = processString(str2);
        return processedString1.equals(processedString2);
    }

    public static String processString(String myString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<myString.length(); i++) {
            if(Character.isLetter(myString.charAt(i))) {
                stringBuilder.append(myString.charAt(i));
            }
        }
        String processedString = stringBuilder.toString();
        return processedString;
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "AB$%^CD";
        System.out.println(ComparisonOfCharactersOnly.isEqual(str1, str2));
    }
}
