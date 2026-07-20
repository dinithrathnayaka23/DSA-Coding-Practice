/*
Decimal to Binary Converter
Using stack.
*/

import java.util.Scanner;

class NodeD{
    int data;
    NodeD next;

    NodeD(int data){
        this.data=data;
        this.next=null;
    }
}

class StackD{
    NodeD top;

    void push(int value){
        NodeD newNode=new NodeD(value);
        newNode.next=top;
        top=newNode;
        return;
    }
    int pop(){
        if (isEmpty()) {
            System.out.println("Stack underflown!");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }
    boolean isEmpty(){
        return top==null;
    }
}

public class Question04 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        StackD obj=new StackD();
        System.out.println("Enter a Decimal Number:");
        int number=sc.nextInt();
        int count=0;
        while (number>0){
            int remainder=number%2;
            obj.push(remainder);
            number=number/2;
            count++;
        }
        System.out.println("Corresponding Binary Number is:");
        for (int i =1; i <=count; i++) {
            System.out.print(obj.pop());
        }
    }
}
