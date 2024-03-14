package week6;

public class FindMaximum {
    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(maxValue(arr));

    }
    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;
        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */