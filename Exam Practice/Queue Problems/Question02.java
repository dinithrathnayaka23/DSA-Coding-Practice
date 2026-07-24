/*
Ticket Counter

Customers arrive.

Serve customers FIFO.
*/
class TicketQueue{
    int queue[];
    int front;
    int rear;
    int maxSize;

    TicketQueue(int size){
        maxSize=size;
        queue=new int[maxSize];
        front=-1;
        rear=-1;
    }

    void enqueue(int customerID){
        if (isFull()) {
            System.out.println("Queue overflown!");
            return;
        }
        rear=rear+1;
        queue[rear]=customerID;
        System.out.println(customerID+" is added to the Queue!");
    }
    int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue underflown!");
            return -1;
        }
        int customerID=queue[front];
        if (front==rear) {
            front=-1;
            rear=-1;
        }else{
            front=front+1;
        }
        return customerID;
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }
    boolean isFull(){
        return rear==maxSize-1;
    }
    boolean isEmpty(){
        return front==-1;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i]+" ");
        }
    }
}

public class Question02 {
    public static void main(String[]args){
        TicketQueue obj=new TicketQueue(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.display();
        System.out.println();
        obj.dequeue();
        obj.dequeue();
        obj.display();
        System.out.println();
        obj.peek();
    }
}
