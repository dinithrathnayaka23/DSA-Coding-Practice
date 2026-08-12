/*
Write a recursive function to multiply two numbers (Note: two numbers are passed as parameters).
*/

import java.util.Scanner;

public class Recursion03 {
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiply(a, b - 1);
        } else {
            return -multiply(a, -b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        System.out.println("Product: " + multiply(a, b));
        sc.close();
    }
}
