import java.util.*;
/*
Search for an Element
Return the index of a given element.
*/

public class Question03 {
    public static void main(String[]args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element you want to search:");
        int enteredElement=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==enteredElement) {
                System.out.println("Entered Element Index is: "+i);
            }
        }
    }
}
