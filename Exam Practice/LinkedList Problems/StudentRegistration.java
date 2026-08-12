/*
1. Student Registration System — Singly Linked List

A university course allows students to register and withdraw throughout the semester. Since the number of registered students can change frequently, you decide to use a Singly Linked List.

Each student node should contain:

Student ID
Student Name
Next

For example:

[101, Dinith] → [105, Kasun] → [110, Amal] → NULL

Your program should allow the administrator to:

Add a student to the end of the list.
Add a student to the beginning of the list.
Search for a student using their Student ID.
Delete a student using their Student ID.
Display all registered students.
Display a message if the student being searched for or deleted doesn't exist.

Try to implement all operations yourself using nodes and pointers/references. Do not use Java's built-in LinkedList.
*/

import java.util.Scanner;

class Node_PP{
    int studentID;
    String name;
    Node_PP next;

    Node_PP(int studentID,String name){
        this.studentID=studentID;
        this.name=name;
        this.next=null;
    }
}

class LinkedStudent{
    Node_PP head;
    
    LinkedStudent(){
        this.head=null;
    }

    void addToEnd(int studentID,String name){
        Node_PP newNode=new Node_PP(studentID, name);
        if (head==null) {
            head=newNode;
            return;
        }
        Node_PP temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void addToStart(int studentID,String name){
        Node_PP newNode=new Node_PP(studentID, name);
        newNode.next=head;
        head=newNode;
    }
    void searchStudent(int studentID){
        Node_PP temp=head;
        boolean found=false;
        while (temp!=null) {
            if (temp.studentID==studentID) {
                found=true;
            }
            temp=temp.next;
        }
        if (found==true) {
            System.out.println("Found");
        } 
        else{
            System.out.println("Not Found!");
        }
    }
    void deleteStudent(int studentID){
        Node_PP temp=head;
        while (temp!=null) {
            if (temp.studentID==studentID) {
                temp=temp.next;
                break;
            }
            temp=temp.next;
        }
    }
    void display(){
        Node_PP temp=head;
        while (temp!=null) {
            System.out.println("StudentID: "+temp.studentID+" Name: "+temp.name);
            temp=temp.next;
        }
    }
}


public class StudentRegistration {
    public static void main(String[] args) {
        LinkedStudent obj=new LinkedStudent();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select an Option:");
        System.out.println("1.Add a student to end of the list");
        System.out.println("2.Add a student to the beginning of the list");
        System.out.println("3.Search for a student using their Student ID");
        System.out.println("4.Display all registered Students:");
        System.out.println("5.Exit");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter student ID:");
                int studentID=sc.nextInt();
                System.out.println("Enter student name:");
                String name=sc.nextLine();
                obj.addToEnd(studentID, name);
                break;

            case 2:
                System.out.println("Enter student ID:");
                int studentID1=sc.nextInt();
                System.out.println("Enter student name:");
                String name1=sc.nextLine();
                obj.addToStart(studentID1, name1);
                break;

            case 3:
                System.out.println("Enter studentID:");
                int sID=sc.nextInt();
                obj.searchStudent(sID);
                break;

            case 4:
                System.out.println("Registered Users:");
                obj.display();
                break;
        
            default:
                break;
        }
    }
}
