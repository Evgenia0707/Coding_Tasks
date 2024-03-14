package week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(15));
        System.out.println("____________________________________");
        System.out.println(isPrime(11));
        System.out.println(isPrime(15));

        System.out.println("__________________________________________");

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = s.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        s.close();
    }

    /**
     * check the number is prime or not
     * @param num
     * @return boolean
     */
    public static boolean primeNumber(int num) {
        if (num < 2) {// Numbers less than 2 are not prime(<=1)
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {//not prime bec it has divisors other than 1 and itself
                return false;
            }
        }
        return true;
    }

    /**
     * method check if a number is prime or not
     *
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Write a method that can check if a number is prime or not    (divisible by 1 and themselves)
ex:
2 is the smallest prime number.
3, 5, 7, 11, 13, 17, 19, etc., are also  prime numbers because they are only divisible by 1 and themselves.
 */
