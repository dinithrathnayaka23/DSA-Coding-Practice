/*Browser History Manager ⭐ (Easy)

Implement a browser's Back functionality using a stack. Every visited page is pushed onto the stack, and pressing Back returns to the previous page.

Features:

Visit a page
Go back
Display current page */
class Node_K{
    String data;
    Node_K next;

    Node_K(String data){
        this.data=data;
        this.next=null;
    }
}

class LinkedListStack{
    Node_K top;

    void visit(String value){
        Node_K newNode=new Node_K(value);
        newNode.next=top;
        top=newNode;
        System.out.println(value+ " page visited!");
    }
    String back(){
        if (isEmpty()) {
            System.out.println("History is Empty!");
        }
        String value=top.data;
        top=top.next;
        return value;
    }
    String currentPage(){
        if (isEmpty()) {
            System.out.println("History is Empty!");
        }
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
    void browserHistory(){
        Node_K temp=top;
        System.out.println("Browser History:");
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class Question05 {
    public static void main(String[] args) {
        LinkedListStack lr=new LinkedListStack();
        lr.visit("Facebook");
        lr.visit("Youtube");
        lr.visit("Tiktok");
        lr.back();
        lr.browserHistory();
    }
}
