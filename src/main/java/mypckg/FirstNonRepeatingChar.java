package mypckg;

import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String myString = "abc abcd abce";
        LinkedHashMap<Character, Integer> myMap = new LinkedHashMap<>();
        for (int i = 0; i<myString.length(); i++) {
            myMap.put(myString.charAt(i), myMap.get(myString.charAt(i)) == null ? 1: myMap.get(myString.charAt(i))+1);
        }
        System.out.println(myMap);

        //        Character nonRepeating = myString.charAt(0);
//        for (int i=0; i<myString.length(); i++) {
//            for (int j=i+1; j<myString.length(); j++) {
//                if (myString.charAt(i) == myString.charAt(j)) {
//                    nonRepeating = myString.charAt(i+1);
//                }
//            }
//        }
    }
}
