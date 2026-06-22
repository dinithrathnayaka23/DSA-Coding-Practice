/* Race Completion Times
The finishing times of runners are stored in an array. Use Bubble Sort to arrange them from fastest to slowest*/

import java.util.Scanner;

class BubbleSort03{
    void bubbleSort03(int times[]){
        int n=times.length;
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-1-i; j++) {
                if (times[j]>times[j+1]) {
                    int temp=times[j];
                    times[j]=times[j+1];
                    times[j+1]=temp;
                }
            }
        }
    }
}

public class Sorting03 {
    public static void main(String[] args) {
        int times[]={
            145, 132, 158, 149, 137,
            141, 129, 154, 135, 147,
            151, 139, 143, 126, 156,
            130, 148, 134, 152, 138
        };
        BubbleSort03 br=new BubbleSort03();
        br.bubbleSort03(times);
        for (int i = 0; i < times.length; i++) {
            System.out.print(times[i]+" ");
        }    
    }
}
