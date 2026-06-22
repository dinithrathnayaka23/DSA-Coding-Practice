class QueueArray{
    int queue[]=new int[5];
    int front=0;
    int rear=-1;
    int size=0;

    void enqueue(int value){
        if (isFull()) {
            System.out.println("Queue overflow!");
        }
        rear=rear+1;
        queue[rear]=value;
        size=size+1;
    }
    int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value=queue[front];
        front=front+1;
        size=size-1;
        return value;
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }
    boolean isFull(){
        return rear==queue.length-1;
    }
    boolean isEmpty(){
        return size==0;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }
        for (int i = front; i <=rear; i++) {
            System.out.println(queue[i]+" ");
        }
    }
}

public class Question03 {
    public static void main(String[]args){
        QueueArray ar=new QueueArray();
        ar.enqueue(10);
        ar.enqueue(20);
        ar.enqueue(30);
        ar.enqueue(40);
        ar.enqueue(50);
        System.out.println(ar.dequeue());
        System.out.println(ar.peek());
        ar.display();
    }
}
