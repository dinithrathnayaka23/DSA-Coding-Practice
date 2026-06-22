class SelectionSort04{
    void selectionSort04(int customerAges[]){
        for (int i = 0; i < customerAges.length; i++) {
            int minIndex=i;
            for (int j = i; j < customerAges.length-1; j++) {
                if (customerAges[j]<customerAges[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=customerAges[i];
            customerAges[i]=customerAges[minIndex];
            customerAges[minIndex]=temp;
        }
    }
}

public class Sorting07 {
    public static void main(String[] args) {
        int[] customerAges = {
            42, 19, 55, 31, 67,
            24, 38, 21, 49, 60,
            18, 35, 72, 27, 45,
            53, 29, 64, 40, 23,
            58, 33, 26, 70, 50
        };
        SelectionSort04 sd=new SelectionSort04();
        sd.selectionSort04(customerAges);
        for (int i = 0; i < customerAges.length; i++) {
            System.out.print(customerAges[i]+" ");
        }
    }
}
