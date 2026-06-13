package Operators;

public class Unary {
    public static void main(String[] args) {
        // Unary Plus and Minus
        int originalNumber = 8;
        int positiveValue = +originalNumber;
        int negativeValue = -originalNumber;

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Unary Plus: " + positiveValue);
        System.out.println("Unary Minus: " + negativeValue);

        // Increment and Decrement
        int counter = 5;
        counter++; // Increment by 1
        System.out.println("After Increment: " + counter);

        counter--; // Decrement by 1
        System.out.println("After Decrement: " + counter);

        // Logical Complement
        boolean isJavaFun = true;
        boolean isJavaNotFun = !isJavaFun;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is Java not fun? " + isJavaNotFun);
    }
}