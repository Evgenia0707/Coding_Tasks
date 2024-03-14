package week5;

public class String_UniqueCharacters {
    public static void main(String[] args) {

        String word = "AABCCD";
        String str = "AAABBBCCCDEF";

        System.out.println(unique(word));
        System.out.println(unique1(word));
        System.out.println(unique2(word));
        System.out.println("____________________");

        System.out.println(unique(str));
        System.out.println(unique1(str));
        System.out.println(unique2(str));
    }

    public static String unique(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {

            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
                result += word.charAt(i);
            }
        }
        return result;
    }

    public static String unique1(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
        }
        return unique;
    }


    public static String unique2(String str) {
        String[] arr = str.split("");
        String unique1 = "";

        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique1 += arr[j];
            }
        }

        return unique1;
    }
}
  /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */