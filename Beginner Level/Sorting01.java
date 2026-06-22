class BubbleSort{
    void bubbleSort(int[]marks){
        int n=marks.length;

        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-1-i; j++) {
                if (marks[j]>marks[j+1]) {
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                }
            }
        }
    }
}

public class Sorting01 {
    public static void main(String[] args) {
        int[] marks = {
            78, 92, 65, 84, 55,
            71, 99, 88, 60, 73,
            81, 95, 67, 50, 89,
            76, 62, 91, 58, 83,
            69, 97, 74, 86, 53,
            80, 66, 94, 77, 72
        };
        BubbleSort b=new BubbleSort();
        b.bubbleSort(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }

    }
}
