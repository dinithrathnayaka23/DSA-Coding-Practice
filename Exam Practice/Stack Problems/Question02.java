/*
Reverse a String Using stack.
*/

import java.util.Scanner;

class Node{
    char ch;
    Node next;

    Node(char ch){
        this.ch=ch;
        this.next=null;
    }
}

class LinkedStack{
    Node top;

    void push(char ch){
        Node newNode=new Node(ch);
        newNode.next=top;
        top=newNode;
    }
    char pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return '\0';
        }
        char ch=top.ch;
        top=top.next;
        return ch;
    }
    boolean isEmpty(){
        return top==null;
    }
}

public class Question02 {
    public static void main(String[]args){
        LinkedStack obj=new LinkedStack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.nextLine();
        for (int i = 0; i <str.length(); i++) {
            obj.push(str.charAt(i));
        }
        System.out.println("Reversed String:");
        for (int i = 0; i <str.length(); i++) {
            System.out.print(obj.pop());
        }
    }
}
