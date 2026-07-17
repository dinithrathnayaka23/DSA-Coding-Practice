/*
Update an Element

Replace the first occurrence of a number with another number.
*/

public class Question04 {
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        System.out.println("Before Replacing:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int replaceNumber=35;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==30) {
                arr[i]=replaceNumber;
           } 
        }
        System.out.println();
        System.out.println("After Replacing:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
