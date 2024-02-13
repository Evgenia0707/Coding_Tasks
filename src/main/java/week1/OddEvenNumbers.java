package week1;

public class OddEvenNumbers {

    public static void oddOrEven(int numbers) {
        if (numbers % 2 == 0) {
            System.out.println(numbers + " is even number1");
        } else {
            if (numbers % 2 != 0) {
                System.out.println(numbers + " is odd number1");
            }
        }
    }

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(6);

        System.out.println("_________________________________________");

        int[] num = {5, 6};
        int evenNumber = 0;
        int oddNumber = 0;

        for (int each : num) {
            if (each % 2 == 0) {
                evenNumber++;
            } else {
                if (each % 2 != 0) {
                    oddNumber++;
                }
            }
            System.out.println("evenNumber2 " + evenNumber);
            System.out.println("oddNumber2 " + oddNumber);

            System.out.println("_________________________________________");

            int number = 5;
//        int number = 6;
            boolean isEven = number % 2 == 0;
            boolean isOdd = !isEven;

            System.out.println(number + " is an even number: " + isEven);
            System.out.println(number + " is an odd number: " + isOdd);
        }
    }
}
/*
write a method which can identify aa given number if it even or odd
Ex:
    identify(5) -> "Odd"
    identify(6) -> "Even"
 */