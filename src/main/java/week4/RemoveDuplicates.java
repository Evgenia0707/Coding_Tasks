package week4;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println(removeDup(str));

    }
    public static String removeDup(String str) {
        if (str == null && str.isEmpty()){
            System.out.println("We have nothing to remove!");
        }
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }
}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */