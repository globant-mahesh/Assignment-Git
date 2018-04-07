package mypckg;

public class TimeConversion {

    public static void main(String[] args) {
        String time = "00:30";
        String[] myArray = time.split(":");
        System.out.println(myArray[0]);
        StringBuilder myStringBuilder = new StringBuilder();
        if(Integer.valueOf(myArray[0]) > 12) {
            int num = Integer.valueOf(myArray[0]);
            num -= 12;
            myStringBuilder.append(num).append(":").append(myArray[1]).append(" PM");
        } else if (Integer.valueOf(myArray[0]) == 12) {
            myStringBuilder.append(myArray[0]).append(":").append(myArray[1]).append(" PM");
        } else {
            myStringBuilder.append(myArray[0]).append(":").append(myArray[1]).append(" AM");
        }
        String convertedTime = myStringBuilder.toString();
        System.out.println(convertedTime);
    }
}
