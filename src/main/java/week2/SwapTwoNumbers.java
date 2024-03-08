package week2;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        swap1(10, 15);
        System.out.println("_____________________________");

        swap2(20, 30);
        System.out.println("____________________________");

        swap3(30, 40);
    }

    public static void swap1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void swap2(int c, int d) {
        int z = c;
        c = d;
        d = z;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

    public static void swap3(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
 /*
    Swap two variable' values without using a third variable
    can also think of ^ xor as "this or that, but not both!"
     */