class CustomerQueue{
    int customerID[]=new int[5];
    int front=0;
    int rear=-1;
    int size=0;

    void enqueue(int cus_ID){
        if (isFull()) {
            System.out.println("Queue overflow!");
            return;
        }
        rear=rear+1;
        customerID[rear]=cus_ID;
        size=size+1;
    }
    int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue underflow!");
            return -1;
        }
        front=front+1;
        int cus_ID=customerID[front];
        size=size-1;
        return cus_ID;
    }
    boolean isFull(){
        return size==customerID.length-1;
    }
    boolean isEmpty(){
        return size==0;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }
        for (int i = front; i <=rear; i++) {
            System.out.println(customerID[i]+" ");
        }
        System.out.println();
    }
}

public class QueuePaper {
    public static void main(String[] args) {
        CustomerQueue c=new CustomerQueue();
        c.enqueue(100);
        c.enqueue(101);
        c.enqueue(102);
        c.enqueue(103);
        c.enqueue(104);
        c.display();
        c.dequeue();
        c.display();
    }
}
