package week1;

import java.util.Scanner;

public class DivideWithoutOperator {
    /**
     * Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {
        System.out.println(divide1(10, 5));
        System.out.println(divide1(0, 5));

        System.out.println("_________________________________________________");

        divide2(10, 5);
        divide2(0, 5);
        divide2(10, 2);

        System.out.println("_________________________________________________");

//        int num1 = 18, num2 = 6;
//        int num1 = 13, num2 = 0;
//        int num1 = 0, num2 = 10;
        int num1 = 40, num2 = -10;
        System.out.println(divide(num1, num2));

        System.out.println("_________________________________________________");

        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int nums1 = scan.nextInt();
        System.out.print("Enter the value: ");
        int nums2 = scan.nextInt();
        if (nums2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        while (nums1 >= nums2) {
            nums1 = nums1 - nums2;
            result++;

        }
        System.out.println("Division is: " + result);

        System.out.println("_________________________________________________");
    }

    public static int divide1(int numb1, int numb2) {
        if (numb2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (numb1 == 0) {
            return 0;
        }

        int divide = 0;
        while (numb1 >= numb2) {
            numb1 -= numb2;
            divide++;
        }
        return divide;
    }

    public static void divide2(int number1, int number2) {
        if (number2 == 0) {
            System.err.println("Invalid number");
            return;
        }
        int divide = 0;
        while (number1 >= number2) {
            number1 = number1 - number2;
            divide++;
        }
        System.out.println(divide);
    }

    public static int divide(int num1, int num2) {
        if (num1 == 0)
            return 0;
        if (num2 == 0)
            throw new ArithmeticException("Division by zero");
        boolean negResult = false;
        if (num1 < 0) {
            num1 = -num1;
            if (num2 < 0)
                num2 = -num2;
            else
                negResult = true;
        } else if (num2 < 0) {
            num2 = -num2;
            negResult = true;
        }
        int divide1 = 0;
        while (num1 >= num2) {
            num1 = num1 - num2;
            divide1++;
        }
        if (negResult)
            divide1 = -divide1;
        return divide1;
    }
}
/*
write a method that can divide two numbers without using division operator
 */


