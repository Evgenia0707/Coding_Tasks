package week6;

public class SumOfAllDigits {
    public static void main(String[] args) {

        String str1 = "12 java 5 apple 3";
        System.out.println("The given string is: " + str1);
        System.out.println("The sum of the digits in the string is: " + sumOfDigits(str1));

    }
    public static int sumOfDigits(String s) {
        int sum = 0;
        String[] numbers = s.replaceAll("[\\D]+", " ").split(" ");
        for (String each : numbers) {
            sum += Integer.parseInt(each);
        }
        return sum;
    }
}
/*          Please implement this method to
            return the sum of all integers found in the parameter String.
            You can assume that integers are separated from other parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */
