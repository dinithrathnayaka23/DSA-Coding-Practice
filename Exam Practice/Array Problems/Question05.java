/*
Reverse an Array
Without creating another array.
*/

import java.util.Scanner;

public class Question05 {
    public static void main(String[]args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse Array:");
        for (int i=arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
