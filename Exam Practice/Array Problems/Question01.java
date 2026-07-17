/*
Implement insertion into an integer array at a given index.

Example

Input:
[10,20,30,40]
Insert 25 at index 2

Output:
[10,20,25,30,40]
*/

public class Question01 {
    public static void main(String[] args) {
        int [] arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        int size=4;
        System.out.println("Array Before Insertion:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int insertIndex=2;
        int insertNumber=25;
        for (int i =size ; i >insertIndex; i--) {
            arr[i]=arr[i-1];
        }
        System.out.println();
        arr[insertIndex]=insertNumber;
        System.out.println("Array After Insertion:");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
