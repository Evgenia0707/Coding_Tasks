package week4;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
    public static void main(String[] args) {

        System.out.println("same = " + same("abc", "cab"));
        System.out.println("same = " + same("abc", "abb"));
        System.out.println("______________________________________________");
        System.out.println("same1 = " + same1("aebbbeec", "carrrttb"));
        System.out.println("same1 = " + same1("abbbccc", "abbbccc"));

    }

    // solution 1:
    public static boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";

        for (char each : ch1) {
            a1 += each;
        }

        for (char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);
    }

    // solution 2
    public static boolean same1(String a, String b) {
//        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        a = new TreeSet<>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }
}
/*
String_Anagram
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */