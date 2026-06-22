/*Hotel Room Prices
Arrange room prices from cheapest to most expensive using Selection Sort. */
class SelectionSort03{
    void selectionSort03(int roomPrices[]){
        for (int i = 0; i < roomPrices.length; i++) {
            int minIndex=i;
            for (int j = i; j < roomPrices.length-1; j++) {
                if (roomPrices[j]<roomPrices[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=roomPrices[i];
            roomPrices[i]=roomPrices[minIndex];
            roomPrices[minIndex]=temp;
        }
    }
}

public class Sorting06 {
    public static void main(String[] args) {
        int[] roomPrices = {
            180, 95, 250, 120, 300,
            150, 220, 85, 175, 140,
            275, 110, 200, 160, 90,
            260, 130, 240, 190, 100
        };
        SelectionSort03 sr=new SelectionSort03();
        sr.selectionSort03(roomPrices);
        for (int i = 0; i < roomPrices.length; i++) {
            System.out.print(roomPrices[i]+" ");
        }
    }
}
