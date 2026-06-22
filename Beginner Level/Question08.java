/* Printer Job Scheduler ⭐ (Easy)

Documents are printed in the order they arrive.

Features:

Add print job
Print next job
View pending jobs */
class Node_B{
    int data;
    Node_B next;

    Node_B(int data){
        this.data=data;
        this.next=null;
    }
}

class PrintQueue{
    Node_B front=null;
    Node_B rear=null;

    void addPrintJob(int jobno){
        Node_B newNode=new Node_B(jobno);
        if (rear==null) {
            front=rear=newNode;
        }
        rear.next=newNode;
        rear=newNode;
    }
    int printNextJob(){
        if (isEmpty()) {
            System.out.println("No print job!");
            return -1;
        }
        int jobno=front.data;
        front=front.next;
        
        if (front==null) {
            rear=null;
        }
        return jobno;
    }
    boolean isEmpty(){
        return front==null;
    }
    void viewPendingJobs(){
        if (isEmpty()) {
            System.out.println("Pending job list is empty!");
        }
        Node_B temp=front;

        while (temp!=null) {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class Question08 {
    public static void main(String[]args){
        PrintQueue pr=new PrintQueue();
        pr.addPrintJob(1);
        pr.addPrintJob(2);
        pr.addPrintJob(3);
        pr.addPrintJob(4);
        pr.viewPendingJobs();
        pr.printNextJob();
        pr.printNextJob();
        pr.viewPendingJobs();
    }
}
