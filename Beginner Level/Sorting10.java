class InsertionSort02{
    void insertionSort02(int regNumbers[]){
        for (int i = 1; i < regNumbers.length; i++) {
            int key=regNumbers[i];
            int j=i-1;
            while (j>=0 && regNumbers[j]>key) {
                regNumbers[j+1]=regNumbers[j];
                j--;
            }
            regNumbers[j+1]=key;
        }
    }
}

public class Sorting10 {
    public static void main(String[] args) {
        int[] regNumbers = {
            235091, 235076, 235104, 235083, 235099,
            235071, 235087, 235095, 235080, 235102,
            235074, 235089, 235097, 235078, 235085
        };
            InsertionSort02 is=new InsertionSort02();
            is.insertionSort02(regNumbers);
            for (int i : regNumbers) {
                System.out.print(i+" ");
            }
    }
}
