/*
4. Printer Job Queue

You are developing a printing system for a university computer lab.

Students send documents to a printer:

Assignment.pdf
Report.docx
Presentation.pptx
ResearchPaper.pdf

The printer should process the documents in the order they were submitted.

For example:

Student A → Assignment.pdf
Student B → Report.docx
Student C → Presentation.pptx

The printer should process:

Assignment.pdf
Report.docx
Presentation.pptx
Your task

Implement a Printer Job Queue.

Your program should allow:

Adding a print job
Processing the next print job
Displaying the next job to be processed
Displaying all pending jobs
Handling the case where there are no pending jobs

You can represent each job using something simple such as:

Job ID
Student Name
File Name

For example:

101 | Dinith | Assignment.pdf
102 | Kasun  | Report.docx
*/

import java.util.Scanner;

class Node_FF{
    String jobName;
    Node_FF next;

    Node_FF(String jobName){
        this.jobName=jobName;
        this.next=null;
    }
}

class PrintJobQueue{
    Node_FF front=null;
    Node_FF rear=null;

    void enqueue(String printJob){
        Node_FF newPrintJob=new Node_FF(printJob);
        if (rear==null) {
            front=rear=newPrintJob;
        }
        rear.next=newPrintJob;
        rear=newPrintJob;
    }
    String dequeue(){
        if (isEmpty()) {
            System.out.println("Print Jobs are empty!");
            return null;
        }
        String printJob=front.jobName;
        front=front.next;
        return printJob;
    }
    String peek(){
        if (isEmpty()){
            System.out.println("No print jobs pending!");
            return null;
        }
        return front.jobName;
    }
    boolean isEmpty(){
        return front==null;
    }
    void display(){
        Node_FF temp=front;
        if (isEmpty()) {
            System.out.println("No print jobs pending!");
        }
        System.out.println("Pending print Jobs:");
        while (temp!=null) {
            System.out.println(temp.jobName);
            temp=temp.next;
        }
    }
}

public class PrintJob {
    public static void main(String[] args) {
        PrintJobQueue obj=new PrintJobQueue();
        obj.enqueue("Print1");
        obj.enqueue("Print2");
        obj.enqueue("Print3");
        obj.display();
        obj.dequeue();
        obj.display();
        System.out.println(obj.peek());
        
    }
}
