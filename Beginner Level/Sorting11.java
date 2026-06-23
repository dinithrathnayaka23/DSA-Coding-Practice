class InsertionSort03{
    void insertionSort03(int customerAges[]){
        for (int i = 1; i < customerAges.length; i++) {
            int key=customerAges[i];
            int j=i-1;
            while (j>=0 && customerAges[j]>key) {
                customerAges[j+1]=customerAges[j];
                j--;
            }
            customerAges[j+1]=key;
        }
    }
}

public class Sorting11 {
    public static void main(String[] args) {
        int[] customerAges = {
            45, 22, 67, 31, 19,
            54, 28, 73, 40, 25,
            61, 18, 35, 50, 29,
            42, 56, 24, 38, 65,
            21, 47, 33, 70, 26,
            59, 30, 52, 41, 27
        };
        InsertionSort03 ir=new InsertionSort03();
        ir.insertionSort03(customerAges);
        for (int i : customerAges) {
            System.out.print(i+" ");
        }
    }
}
