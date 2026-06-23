class SelectionSort02{
    void selectionSort02(int bookIds[]){
        for (int i = 1; i < bookIds.length; i++) {
            int key=bookIds[i];
            int j=i-1;
            while (j>=0 && bookIds[j]>key) {
                bookIds[j+1]=bookIds[j];
                j--;
            }
            bookIds[j+1]=key;
        }
    }
}

public class Sorting09 {
    public static void main(String[] args) {
        int[] bookIds = {
            105, 98, 112, 101, 95,
            109, 103, 99, 107, 100,
            110, 96, 104, 108, 97
        };
        SelectionSort02 sl=new SelectionSort02();
        sl.selectionSort02(bookIds);
        for (int i : bookIds) {
            System.out.print(i+" ");
        }
    }
}
