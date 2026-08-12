/*
The Fibonacci numbers are series of numbers that each number is the sum of the two preceding ones, starting from 0 and 1.
0 th Fibonacci number is defined as 0 and 1st Fibonacci number is defined as 1 and rest of each number equals the sum of the two numbers before it. The sequence of Fibonacci numbers: 0,1,1,2,3,5,8,13,21,...
Write a recursive function to get Fibonacci number of a given term.
*/

import java.util.Scanner;

public class Recursion04 {
    public static int fibo(int n){
        if (n==0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" ");
        }
    }
}
