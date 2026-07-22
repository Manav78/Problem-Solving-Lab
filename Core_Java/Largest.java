package Core_Java;
// Q2. Write a Java program to find the largest of three numbers.

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is Greater.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is Greater.");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is Greater.");
        } else {
            System.out.println("All are same.");
        }
        sc.close();
    }
}
