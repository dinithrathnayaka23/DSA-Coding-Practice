/* Athlete Selection
A coach wants to arrange athletes by their trial scores. Repeatedly select the lowest score and place it at the beginning using Selection Sort.*/
class SelectionSort{
    void selectionSort01(int scores[]){
        for (int i = 0; i < scores.length-1; i++) {
            int minIndex=i;
            for (int j = i; j < scores.length; j++) {
                if (scores[j]<scores[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=scores[i];
            scores[i]=scores[minIndex];
            scores[minIndex]=temp;
        }
    }
}

public class Sorting04 {
    public static void main(String[] args) {
        int[] scores = {
            78, 91, 65, 84, 72,
            88, 59, 95, 67, 81,
            74, 99, 63, 86, 70,
            92, 76, 68, 89, 83
        };
        SelectionSort s=new SelectionSort();
        s.selectionSort01(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]+" ");
        }
    }
}
