/*
Check Balanced Parentheses
()

{}

[]
*/

import java.util.Scanner;

class NodeA{
    char data;
    NodeA next;

    NodeA(char data){
        this.data=data;
        this.next=null;
    }
}

class StackForQ3{
    NodeA top;

    void push(char data){
        NodeA newNode=new NodeA(data);
        newNode.next=top;
        top=newNode;
    }
    char pop(){
        if (isEmpty()) {
            System.out.println("Stack underflown!");
            return '\0';
        }
        char data=top.data;
        top=top.next;
        return data;
    }
    char peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return '\0';
        }
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
}

public class Question03 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your expression:");
        String expression=sc.nextLine();
        StackForQ3 obj=new StackForQ3();
        boolean balanced=true;

        for (int i = 0; i <expression.length(); i++) {
            char ch=expression.charAt(i);

            if (ch=='(' || ch=='{'|| ch=='[') {
                obj.push(ch);
            }
            else if(ch==')'|| ch=='}'|| ch==']'){
                if (obj.isEmpty()) {
                    balanced=false;
                    break;
                }
                char top=obj.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    balanced=false;
                    break;
                }
            }
        }
        if (!obj.isEmpty()) {
            balanced=false;
        }
        if (balanced) {
            System.out.println("Balanced");
        } else{
            System.out.println("Not Balanced");
        }
    }
}
