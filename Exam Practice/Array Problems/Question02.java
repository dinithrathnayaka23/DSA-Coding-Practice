/*
Delete an Element
Delete the element at a given position by shifting elements.

Input:
[10,20,30,40,50]
Delete at index 3

*/

public class Question02 {
    public static void main(String[]args){
        int arr[]=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        int size=5;
        System.out.println("Array Before Deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        int deleteIndex=3;
        for (int i = 0; i < size; i++) {
            if(arr[i]==arr[deleteIndex]){
                arr[i]=arr[i+1];
                size--;
            }
        }
        System.out.println();
        System.out.println("Array After Deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
