/*
Write a recursive function to find the factorial of a given number.
*/

import java.util.Scanner;

public class Recursion05 {
    public static int fact(int n){
        if (n==0) {
            return 1;
        }
        else if (n==1) {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Factorial:"+fact(n));
    }
}
