/*
Merge Two Arrays
Merge into a third array.
*/

public class Question09 {
    public static void main(String[]args){
        int arr1[]={10,20,30,40};
        int arr2[]={50,60,70};

        int merged[]=new int[arr1.length+arr2.length];
        int index=0;

        for (int i = 0; i < arr1.length; i++) {
            merged[index]=arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[index]=arr2[i];
            index++;
        }

        System.out.println("Merged Array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]+" ");
        }

    }
}
