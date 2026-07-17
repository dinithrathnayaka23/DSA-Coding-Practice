/*
Movie Ratings

Store ratings.

Display:
Highest rated
Lowest rated
Average
*/

import java.util.Scanner;

public class Question11 {
    public static void main(String[]args){
        int[] ratings = {8, 9, 6, 7, 10, 5, 8, 9, 7, 6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the option you want to select");
        System.out.println("1.Get Highest Rating");
        System.out.println("2.Get Lowest Rating");
        System.out.println("3.Get Average Rating");
        System.out.println("4.Exit");
        int option=sc.nextInt();
        switch (option) {
            case 1:
                int highest=ratings[0];
                for (int i = 0; i < ratings.length; i++) {
                    if (ratings[i]>highest) {
                        highest=ratings[i];
                    }
                }
                System.out.println("Highest Rating:"+highest);
                break;

            case 2:
                int lowest=ratings[0];
                for (int i = 0; i < ratings.length; i++) {
                    if (ratings[i]<lowest) {
                        lowest=ratings[i];
                    }
                }
                System.out.println("Lowest Rating:"+lowest);
                break;

            case 3:
                int sum=0;
                for (int i = 0; i < ratings.length; i++) {
                    sum=sum+ratings[i];
                }
                double average=sum/ratings.length;
                System.out.println("Average Rating:"+average);
                break;

            case 4:
                break;

            default:
                System.out.println("Invalid Option Selection !");
                break;
        }
    }
}
