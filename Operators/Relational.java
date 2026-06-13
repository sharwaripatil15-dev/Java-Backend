package Operators;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 =10;
	int num2 = 20;
	System.out.println("num1 > num2 is " + (num1 > num2));
	System.out.println("num1 < num2 is " + (num1 < num2));
	System.out.println("num1 >= num2 is " + (num1 >= num2));
	System.out.println("num1 <= num2 is " + (num1 <= num2));
	System.out.println("num1 == num2 is " + (num1 == num2));
	System.out.println("num1 != num2 is " + (num1 != num2));
}
}