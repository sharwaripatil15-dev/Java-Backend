package Operators;

public class Assignment{
    public static void main(String[] args) {
        // Simple Assignment Operator
        int a = 10;

        // Compound Assignment Operator
        int b = 5;
        b += 3; // b is now 8

        int c = 12;
        c -= 4; // c is now 8

        int d = 6;
        d *= 2; // d is now 12

        int e = 20;
        e /= 5; // e is now 4

        int f = 17;
        f %= 4; // f is now 1

        // Displaying the results
        System.out.println("= Operator : " + a);
        System.out.println("+= Operator : " + b);
        System.out.println("-= Operator : " + c);
        System.out.println("*= Operator : " + d);
        System.out.println("/= Operator : " + e);
        System.out.println("%= Operator : " + f);
    }
}        