/*
Student Marks Manager

Store marks of 50 students.

Features:

Add mark
Delete mark
Update mark
Find average
Highest mark
Lowest mark
*/

public class Question13 {
    
    static int[] marks = new int[50]; // Store maximum 50 students
    static int count = 0; // Current number of students

    // Add a student's mark
    public static void addMark(int mark) {

        if (count < marks.length) {
            marks[count] = mark;
            count++;
            System.out.println("Mark added successfully");
        } else {
            System.out.println("No space available");
        }
    }


    // Delete mark using student index
    public static void deleteMark(int index) {

        if (index >= 0 && index < count) {

            // Shift elements left
            for (int i = index; i < count - 1; i++) {
                marks[i] = marks[i + 1];
            }

            count--;
            System.out.println("Mark deleted successfully");

        } else {
            System.out.println("Invalid index");
        }
    }


    // Update mark
    public static void updateMark(int index, int newMark) {

        if (index >= 0 && index < count) {

            marks[index] = newMark;
            System.out.println("Mark updated successfully");

        } else {
            System.out.println("Invalid index");
        }
    }


    // Find average mark
    public static double findAverage() {

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += marks[i];
        }

        return (double) sum / count;
    }


    // Find highest mark
    public static int findHighest() {

        int highest = marks[0];

        for (int i = 1; i < count; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        return highest;
    }


    // Find lowest mark
    public static int findLowest() {

        int lowest = marks[0];

        for (int i = 1; i < count; i++) {

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        return lowest;
    }


    // Display all marks
    public static void displayMarks() {

        System.out.print("Student Marks: ");

        for (int i = 0; i < count; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
    }
    public static void main(String[]args){
        
        // Adding marks
        addMark(85);
        addMark(76);
        addMark(92);
        addMark(65);
        addMark(88);


        displayMarks();


        // Update student 2 mark
        updateMark(1, 80);

        displayMarks();


        // Delete student 3 mark
        deleteMark(2);

        displayMarks();


        // Statistics
        System.out.println("Average: " + findAverage());
        System.out.println("Highest Mark: " + findHighest());
        System.out.println("Lowest Mark: " + findLowest());
    }
}
