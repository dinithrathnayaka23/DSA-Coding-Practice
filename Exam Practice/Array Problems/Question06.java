/*
Rotate Array Left by K Positions
Input:
1 2 3 4 5
k=2

Output:
3 4 5 1 2
*/

public class Question06 {
    public static void main(String[]main){
        int arr[]={1,2,3,4,5};
        System.out.println("Before Rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int k=2;
        for (int i = 0; i < k; i++) {
            int temp=arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[4]=temp;
        }
        System.out.println();
        System.out.println("After Rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
