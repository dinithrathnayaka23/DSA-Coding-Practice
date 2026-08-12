/*
3. Supermarket Checkout Queue

A supermarket has a single checkout counter. Customers join the queue as they arrive.

For example:

Customer 1
Customer 2
Customer 3
Customer 4

Customer 1 should be served first, followed by Customer 2, and so on.

Your task

Create a Queue-based checkout system.

Your program should allow:

A customer to join the queue.
The next customer to be served.
Displaying the customer currently at the front.
Displaying all customers waiting in the queue.
Handling an empty queue.

Example:

Customer joined: John
Customer joined: Alice
Customer joined: David

Serving: John

Serving: Alice

People waiting:
David

Think carefully about which end customers enter and which end they leave from.
*/
class Node_VV{
    String name;
    Node_VV next;
     
    Node_VV(String name){
        this.name=name;
        this.next=null;
    }
}

class SuperMarketQueue{
    Node_VV front=null;
    Node_VV rear=null;

    void enqueue(String name){
        Node_VV newCustomer=new Node_VV(name);
        if (rear==null) {
            front=rear=newCustomer;
        }
        rear.next=newCustomer;
        rear=newCustomer;
    }
    String dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        String name=front.name;
        front=front.next;
        return name;
    }
    String peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return front.name;
    }
    boolean isEmpty(){
        return front==null;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }
        Node_VV temp=front;
        while (temp!=null) {
            System.out.println(temp.name);
            temp=temp.next;
        }
    }
}


public class SuperMarket {
    public static void main(String[]args){
        SuperMarketQueue obj=new SuperMarketQueue();
        obj.enqueue("Dinith");
        obj.enqueue("Nikini");
        obj.enqueue("Pabasara");
        obj.enqueue("Nemina");
        obj.display();
        obj.dequeue();
        obj.display();
        System.out.println(obj.peek());
    }
}
