/*
Write a recursive function to get multiplication up to given number. Example if 5 input as a parameter output should be (5*4*3*2*1=120)
*/

import java.util.Scanner;

public class Recursion02 {
    public static int getMul(int num){
        if (num == 0) {
            return 1;
        } else {
            return num * getMul(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println(getMul(n));
    }
}
