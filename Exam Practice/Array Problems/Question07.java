/*
Rotate Array Right by K Positions(Take user input)
*/

import java.util.Scanner;

public class Question07 {
    public static void main(String[]args){
        int arr[]=new int[5];
        System.out.println("Enter Array Elements:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the number of times you want to Rotate the array:");
        int k=sc.nextInt();
        for (int i = 0; i < k; i++) {
            int temp=arr[4];
            for (int j = arr.length-1;j>0; j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println();
        System.out.println("After Rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
