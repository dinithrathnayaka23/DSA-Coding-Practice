class InsertionSort01{
    void insertionSort(int cards[]){
        for (int i = 1; i < cards.length; i++) {
            int key=cards[i];
            int j=i-1;
            while(j>=0 && cards[j]>key){
                cards[j+1]=cards[j];
                j--;
            }
            cards[j+1]=key;
        }
    }
}

public class Sorting08 {
    public static void main(String[] args) {
        int[] cards = {
            7, 3, 12, 1, 9,
            5, 13, 2, 8, 6,
            11, 4, 10, 15, 14,
            19, 17, 16, 20, 18
        };
        InsertionSort01 ir=new InsertionSort01();
        ir.insertionSort(cards);
        for (int i : cards) {
            System.out.print(i+ " ");
        }
    }
}
