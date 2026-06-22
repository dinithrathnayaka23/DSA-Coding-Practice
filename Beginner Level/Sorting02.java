import java.util.Scanner;

class BubbleSort02{
    void bubbleSort02(double prices[]){
        int n=prices.length;
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (prices[j]>prices[j+1]) {
                    double temp=prices[j];
                    prices[j]=prices[j+1];
                    prices[j+1]=temp;
                }
            }
        }
    }
}

public class Sorting02 {
    public static void main(String[] args) {
        double prices[]=new double[10];
        System.out.println("Enter the prices:");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < prices.length; i++) {
            prices[i]=sc.nextDouble();
        }
        BubbleSort02 bb=new BubbleSort02();
        bb.bubbleSort02(prices);
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i]+" ");
        }
    }
}
