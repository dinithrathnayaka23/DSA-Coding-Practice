/*
1. Student Registration System — Insertion

A university maintains an array containing the student IDs of students registered for a particular course.

Initially:

[1023, 1045, 1089, 1102, 1156]

A new student with ID 1075 registers for the course. The university wants the IDs to remain in ascending order.

Write a Java program to insert 1075 into the correct position without creating a second array.

Your program should:

Find the appropriate position.
Shift the required elements.
Insert the new student ID.
Display the resulting array.
*/

public class StudentRegistration {
    public static void main(String[] args){
        int studentID[]=new int[6];
        studentID[0]=1023;
        studentID[1]=1045;
        studentID[2]=1089;
        studentID[3]=1102;
        studentID[4]=1156;
        int insertNum=1075;
        int insertIndex=2;
        int size=5;
        for (int i=size;i>insertIndex;i--) {
            studentID[i]=studentID[i-1];
        }
        studentID[insertIndex]=insertNum;
        for (int i = 0; i < studentID.length; i++) {
            System.out.print(studentID[i]+" ");
        }
    }
}
