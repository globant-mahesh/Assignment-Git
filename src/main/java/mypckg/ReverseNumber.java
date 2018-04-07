package mypckg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 123;
        List<Integer> myList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        while(num/10 != 0) {
            myList.add(num%10);
            num /= 10;
        }
        myList.add(num);
        System.out.println(myList);
        Iterator myIterator = myList.iterator();
        while (myIterator.hasNext()) {
            stringBuilder.append(myIterator.next());
        }
        String numStr = stringBuilder.toString();
        int reverseNum = Integer.valueOf(numStr);
        System.out.println(reverseNum);
    }

}
