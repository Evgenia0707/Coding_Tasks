package week7;

import java.util.Arrays;

public class Array_SortDescending {
    public static void main(String[] args) {

        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortingArrayDescending(arr)));
    }
    public static int[] sortingArrayDescending(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
 */