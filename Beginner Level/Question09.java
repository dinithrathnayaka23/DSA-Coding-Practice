/* Customer Support Ticket System (Medium)

Support tickets are handled on a first-in, first-out basis.

Features:

Submit ticket
Resolve ticket
Display pending tickets*/

class Node_C{
    int data;
    Node_C next;

    Node_C(int data){
        this.data=data;
        this.next=null;
    }
}

class TicketSystem{
    Node_C front=null;
    Node_C rear=null;

    void submitTicket(int ticketno){
        Node_C newNode=new Node_C(ticketno);
        if (rear==null){
            front=rear=newNode;
        }
        rear.next=newNode;
        rear=newNode;
    }
    int resolveTicket(){
        if (isEmpty()) {
            System.out.println("No tickets to resolve!");
            return -1;
        }
        int ticketno=front.data;
        front=front.next;

        if (front==null) {
            rear=null;
        }
        return ticketno;
    }
    boolean isEmpty(){
        return front==null;
    }
    void displayPendingTickets(){
        if (isEmpty()) {
            System.out.println("No tickets available!");
        }
        Node_C temp=front;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class Question09 {
    public static void main(String[] args) {
        TicketSystem tr=new TicketSystem();
        tr.submitTicket(1);
        tr.submitTicket(2);
        tr.submitTicket(3);
        tr.submitTicket(4);
        tr.displayPendingTickets();
        tr.resolveTicket();
        tr.resolveTicket();
        tr.displayPendingTickets();
    }
}
