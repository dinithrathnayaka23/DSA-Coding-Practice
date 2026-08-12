/*
8. University Student Marks — 2D Array

A university wants to store the marks of 5 students in 3 subjects using a 2D array.

For example:

             Math   DSA   Database
Student 1     75    82      68
Student 2     90    76      85
Student 3     65    70      72
Student 4     88    91      79
Student 5     72    68      80

Write a program that:

Stores the marks using a 2D array.
Calculates the total marks for each student.
Finds the highest-scoring student.
Calculates the average mark for each subject.
Displays the results clearly.
*/

public class UniversityMarks {
    public static void main(String[]args){
        int marks[][]={
            {75,82,68},
            {90,76,85},
            {65,70,72},
            {88,91,79},
            {72,68,80},
        };
        
        int highestTotal=0;
        int highestStudent=0;

        for (int i = 0; i < marks.length; i++) {
            int total=0;
            for (int j = 0; j < marks[i].length; j++) {
                total=marks[i][j];
            }
            System.out.println("Student "+(i+1)+" Total: "+total);

            if (total>highestTotal) {
                highestTotal=total;
                highestStudent=i;
            }
        }
        System.out.println("\nHighest Scoring Student:");
        System.out.println("Student "+(highestStudent+1)+" with "+highestTotal+" marks");

        System.out.println("\nSubject Acerages:");
        for (int i = 0; i < 3; i++) {
            int total=0;
            for (int j = 0; j < marks.length; j++) {
                total=total+marks[i][j];
            }
            double average=(double) total/marks.length;

            if (i==0) {
                System.out.println("Math: "+average);
            }
            else if (i==1) {
                System.out.println("DSA: "+average);
            }
            else{
                System.out.println("Database: "+average);
            }
        }
    }
}
