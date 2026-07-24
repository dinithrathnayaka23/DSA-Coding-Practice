class NodeX{
    int data;
    NodeX next;
    
    NodeX(int data){
        this.data=data;
        this.next=null;
    }
}

class QueueLinked{
    NodeX front=null;
    NodeX rear=null;

    void enqueue(int value){
        NodeX newNode=new NodeX(value);
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
        NodeX temp=front;
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}

public class Question01 {
    public static void main(String[]args){
        QueueLinked obj=new QueueLinked();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.display();
        System.out.println();
        obj.dequeue();
        obj.dequeue();
        obj.display();
    }
}
