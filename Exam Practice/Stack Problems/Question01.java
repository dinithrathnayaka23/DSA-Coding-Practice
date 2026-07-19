/*
Implement Stack:

Functions:

push()
pop()
peek()
isEmpty()
isFull()
*/
class StackArray{
    int maxSize;
    int [] stack;
    int top;

    StackArray(int size){
        maxSize=size;
        stack=new int [maxSize];
        top=-1;
    }
    void push(int value){
        if (isFull()) {
            System.out.println("Stack overflown!");
            return;
        }
        top=top+1;
        stack[top]=value;
        System.out.println(value+" is added to the stack!");
    }
    int pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1;
        }
        int value=stack[top];
        top=top-1;
        return value;
    }
    int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==maxSize-1;
    }

    void display(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements:");
        for (int i =top; i>=0; i--) {
            System.out.print(stack[i]+" ");
        }
    }
}

public class Question01 {
    public static void main(String[]args){
        StackArray obj=new StackArray(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.display();
        obj.pop();
        System.out.println();
        obj.display();
        System.out.println();
        System.out.println(obj.peek());
        
        
    }
}
