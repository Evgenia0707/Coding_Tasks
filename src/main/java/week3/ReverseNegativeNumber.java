package week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-35));
        System.out.println(reverse(35));

    }

    /**
     * method reverse digits of a negative number
     *
     * @param number
     * @return int
     */
    public static int reverse(int number) {
        if (number < 10 && number >= 0) {
            return number;
        }
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;            //last digit of the input number (obtained using the modulus operator %)
            number /= 10;
        }
        return result;
    }
    static int rev = 0;
    static int base = 1;

    public static int reverseDigits(int num) {
        if (num < 10 && num >= 0) {
            return num;
        }
        if (num > 0) {
            reverseDigits(num / 10);
            rev += (num % 10) * base;
            base *= 10;
        }
        return rev;
    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */