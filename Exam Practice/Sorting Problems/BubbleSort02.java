public class BubbleSort02 {
    public static void bubblesort(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[]args){
        int arr[]={7,2,9,1,5};
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        bubblesort(arr);
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
