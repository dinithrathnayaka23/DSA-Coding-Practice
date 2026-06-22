class Node_N{
    int data;
    Node_N next;

    Node_N(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedQueue{
    Node_N front=null;
    Node_N rear=null;

    void enqueue(int value){
        Node_N newNode=new Node_N(value);
        if (rear==null) {
            front=rear=newNode;
        }
        rear.next=newNode;
        rear=newNode;
    }
    int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value=front.data;
        front=front.next;
        if (front==null) {
            rear=null;
        }
        return value;
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }
    boolean isEmpty(){
        return front==null;
    }
    void display(){
        Node_N temp=front;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class Question04 {
    public static void main(String[] args) {
        LinkedQueue qr=new LinkedQueue();
        qr.enqueue(10);
        qr.enqueue(20);
        qr.enqueue(30);
        qr.enqueue(40);
        qr.enqueue(50);
        System.out.println(qr.dequeue());
        System.out.println(qr.peek());
        qr.display();
    }
}
