/*
Temperature Logger

Store daily temperatures for one month.

Find

Average
Maximum
Minimum
Number of hot days (>35)
*/

import java.util.Scanner;

public class Question12 {
    public static void main(String[]args){
        int[] temperatures = {
            31, 33, 34, 36, 35,
            32, 30, 29, 37, 38,
            36, 34, 33, 31, 35,
            39, 40, 37, 36, 34,
            32, 30, 28, 31, 33,
            35, 36, 38, 37, 34
        };
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the option you want:");
        System.out.println("1.Get the Average Temperature");
        System.out.println("2.Get the Maximum Temperature");
        System.out.println("3.Get the Minimum Temperature");
        System.out.println("4.Exit");
        int option=sc.nextInt();
        switch (option) {
            case 1:
                int sum=0;
                for (int i = 0; i < temperatures.length; i++) {
                    sum=sum+temperatures[i];
                }
                double average=sum/temperatures.length;
                System.out.println("Average Temperature:"+average);
                break;
        
            case 2:
                int maximum=temperatures[0];
                for (int i = 0; i < temperatures.length; i++) {
                    if (temperatures[i]>maximum) {
                        maximum=temperatures[i];
                    }
                }
                System.out.println("Maximum Temperature:"+maximum);
                break;

            case 3:
                int minimum=temperatures[0];
                for (int i = 0; i < temperatures.length; i++) {
                    if (temperatures[i]<minimum) {
                        minimum=temperatures[i];
                    }
                }
                System.out.println("Minimum Temperature:"+minimum);
                break;

            case 4:
                break;

            default:
                System.out.println("Invalid selection option!");
                break;
        }
    }
}
