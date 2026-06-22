/*Bank Customer Queue ⭐ (Easy)

Customers wait in line to be served.

Features:

Add customer
Serve customer
Display next customer
Show queue */
class QueueBank{
    String customer[]=new String[4];
    int front=0;
    int rear=-1;
    int size=0;

    void addCustomer(String name){
        if (isFull()) {
            System.out.println("Queue is filled!");
        }
        rear=rear+1;
        customer[rear]=name;
        size=size+1;
    }
    String serveCustomer(){
        if (isEmpty()) {
            System.out.println("Queue is No longer!");
        }
        String name=customer[front];
        front=front+1;
        size=size-1;
        System.out.println("Customer is served!");
        return name;
    }
    String showNextCustomer(){
        if (isEmpty()) {
            System.out.println("Queue is at end!");
        }
        return customer[front];
    }
    boolean isFull(){
        return rear==customer.length-1;
    }
    boolean isEmpty(){
        return size==0;
    }
    void showQueue(){
        System.out.println("List of customers!");
        for (int i =front; i<=rear; i++) {
            System.out.println(customer[i]);
        }
    }
}

public class Question07 {
    public static void main(String[] args) {
        QueueBank qb=new QueueBank();
        qb.addCustomer("Dinith");
        qb.addCustomer("Nikini");
        qb.addCustomer("Nemina");
        qb.addCustomer("Pabasara");
        qb.showQueue();
        System.out.println(qb.showNextCustomer());
        qb.serveCustomer();
        qb.serveCustomer();
        qb.showQueue();
    }
}
