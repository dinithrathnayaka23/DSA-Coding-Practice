/*
Palindrome checker using stack
*/

import java.util.Scanner;

class NodeP{
    char data;
    NodeP next;

    NodeP(char data){
        this.data=data;
        this.next=null;
    }
}

class StackP{
    NodeP top;

    void push(char data){
        NodeP newNode=new NodeP(data);
        newNode.next=top;
        top=newNode;
        return;
    }
    char pop(){
        if (isEmpty()) {
            System.out.println("Stack Underflown!");
            return '\0';
        }
        char data=top.data;
        top=top.next;
        return data;
    }
    boolean isEmpty(){
        return top==null;
    }
}

public class Question06 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        StackP obj=new StackP();
        System.out.println("Enter the word:");
        String word=sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            obj.push(word.charAt(i));
        }
        String reversedWord="";
        for (int i = 0; i <word.length(); i++) {
            reversedWord=reversedWord+obj.pop();
        }
        if (word.equals(reversedWord)) {
            System.out.println("The Entered word is a Palindrome!");
        } else{
            System.out.println("The entered word is not a Palindrome!");
        }
    }
}
