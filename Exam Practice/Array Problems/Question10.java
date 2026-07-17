/*
Find Second Largest Number in an Array
*/

public class Question10 {
    public static void main(String[]args){
        int arr[]={10,15,43,21,56,32,64,97,31};
        int largest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                 largest=arr[i];
            }
        }
        int secondLargest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>secondLargest && arr[i]<largest) {
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+secondLargest);
    }
}
