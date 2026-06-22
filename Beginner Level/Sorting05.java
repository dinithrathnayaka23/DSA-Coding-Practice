/* Warehouse Item Codes
Sort warehouse item codes by repeatedly selecting the smallest remaining code.*/
class SelectionSort02{
    void selectionSort02(int itemCodes[]){
        for (int i = 0; i <itemCodes.length-1; i++) {
            int minIndex=i;
            for (int j = i; j < itemCodes.length; j++) {
                if (itemCodes[j]<itemCodes[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=itemCodes[i];
            itemCodes[i]=itemCodes[minIndex];
            itemCodes[minIndex]=temp;
        }
    }
}

public class Sorting05 {
    public static void main(String[] args) {
        int[] itemCodes = {
            1045, 1021, 1098, 1012, 1067,
            1034, 1089, 1005, 1073, 1056,
            1018, 1092, 1041, 1009, 1080,
            1027, 1062, 1039, 1051, 1015
        };
        SelectionSort02 se=new SelectionSort02();
        se.selectionSort02(itemCodes);
        for (int i = 0; i < itemCodes.length; i++) {
            System.out.print(itemCodes[i]+" ");
        }
    }
}
