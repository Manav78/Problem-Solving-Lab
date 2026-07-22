package Core_Java;
// Q1.Write a Java program to swap two numbers without using a third variable.

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: ");
        System.out.println("1st = " + a + "\n2nd = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: ");
        System.out.println("1st = " + a + "\n2nd = " + b);
    }
}
