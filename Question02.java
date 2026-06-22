//stack implementation using linkedlist
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedStack{
    Node top;

    void push(int value){
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
        System.out.println(value+" is pushed to the stack!");
    }
    int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }

        Node temp=top;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class Question02 {
    public static void main(String[]args){
        LinkedStack ls=new LinkedStack();
        ls.push(10);
        ls.push(20);
        ls.push(30);
        ls.push(40);
        ls.pop();
        System.out.println(ls.peek());
        ls.display();
    }
}
