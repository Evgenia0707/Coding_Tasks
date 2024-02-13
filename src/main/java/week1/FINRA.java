package week1;

public class FINRA {
    public static void main(String[] args) {

        FINRA1();
        System.out.println("__________________________");
        printFINRA();
        System.out.println("__________________________");
        printFINRA1();
    }

    public static void FINRA1(){
        String result = "";
        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0 && i % 3 == 0){
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            }else {
                result += i + " ";
            }
        }
        System.out.println(result);
    }
    public static void printFINRA(){
        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("FINRA ");
            }
            else if (i % 5 == 0) {
                System.out.print("RA ");
            }
            else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printFINRA1() {
        int i = 1;
        while (i <= 30) {
            if (i % 15 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else { // otherwise
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
/**
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a
multiple of both 3 and 5, print "week1.FINRA" instead of the number.
public static void FINRA1() {
 */