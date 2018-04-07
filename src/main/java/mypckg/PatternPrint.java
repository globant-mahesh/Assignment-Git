package mypckg;

public class PatternPrint {
    public static void main(String[] args) {
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; count < 3; count++) {
            while (i < count) {
                stringBuilder.append(i + 1);
                i++;
            }
        }
        stringBuilder.append("\n");
        String myString = stringBuilder.toString();
        System.out.println(myString);
    }
}
