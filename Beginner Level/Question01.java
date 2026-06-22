//stack array implementation

class StackArray{
    int maxSize;
    int[]stack;
    int top;

    StackArray(int size){
        maxSize=size;
        stack=new int[maxSize];
        top=-1;
    }
    //push method
    void push(int value){
        if (isFull()) {
            System.out.println("Stack overflow!");
            return;
        }
        top=top+1;
        stack[top]=value;
        System.out.println(value+" value is pushed into the stack!");
    }
    //pop operation
    int pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1;
        }
        int value=stack[top];
        top=top-1;
        return value;
    }
    //peek operation
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
        }
        for (int i = top; i>=0; i--) {
            System.out.print(stack[i]+" ");
        }
    }
}

public class Question01{
    public static void main(String[]args){
        StackArray ar=new StackArray(5);
        ar.push(10);
        ar.push(20);
        ar.push(30);
        ar.push(40);
        ar.push(50);
        ar.pop();
        System.out.println(ar.peek());
        ar.display();
    }
}