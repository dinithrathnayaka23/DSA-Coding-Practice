/*
5. Customer Support Ticket System

A software company receives customer support requests.

Tickets arrive throughout the day:

Ticket 101 → Login problem
Ticket 102 → Payment problem
Ticket 103 → Account problem
Ticket 104 → Password reset

The support team wants to handle tickets in the same order they were received.

Your task

Build a Customer Support Ticket Queue.

Each ticket should contain at least:

Ticket ID
Customer Name
Problem

Your system should support:

Creating a new support ticket.
Adding the ticket to the waiting list.
Handling the next ticket.
Viewing the next ticket that will be handled.
Displaying the number of customers currently waiting.
Displaying all waiting tickets.
Handling the situation where there are no tickets.
*/

class Node_GG{
    int ticketID;
    String customer_name;
    String problem;
    Node_GG next;

    Node_GG(int ticketID,String customer_name,String problem){
        this.ticketID=ticketID;
        this.customer_name=customer_name;
        this.problem=problem;
        this.next=null;
    }
}

class CustomerTicketQueue{
    Node_GG front=null;
    Node_GG rear=null;

    void enqueue(int ticketID,String customer_name,String problem){
        Node_GG newTicket=new Node_GG(ticketID, customer_name, problem);
        if (rear==null) {
            front=rear=newTicket;
        }
        rear.next=newTicket;
        rear=newTicket;
    }

    void dequeue(){
        if (isEmpty()) {
            System.out.println("Ticket List is empty!");
        }
        int ticketID=front.ticketID;
        String customer_name=front.customer_name;
        String problem=front.problem;
        front=front.next;
    }

    void peek(){
        if (isEmpty()) {
            System.out.println("Ticket List is empty!");
        }
        System.out.println(front.ticketID+" "+front.customer_name+" "+front.problem);
    }
    void display(){
        Node_GG temp=front;
        if (isEmpty()) {
            System.out.println("Ticket List is empty!");
        }
        while (temp!=null) {
            System.out.println(temp.ticketID+" "+temp.customer_name+" "+temp.problem);
            temp=temp.next;
        }
    }
    boolean isEmpty(){
        return front==null;
    }
}

public class CustomerTicket {
    public static void main(String[] args) {
        CustomerTicketQueue obj=new CustomerTicketQueue();
        obj.enqueue(1, "Dinith", "No ticket");
        obj.enqueue(1, "Nemina", "No ticket");
        obj.enqueue(1, "Nikini", "No ticket");
        obj.enqueue(1, "Pabasara", "No ticket");
        obj.display();
        obj.dequeue();
        obj.display();
        obj.peek();
    }
}
