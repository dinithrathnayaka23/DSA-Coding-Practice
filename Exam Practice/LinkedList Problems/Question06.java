/*
Delete Last Node
*/
class DeleteAtEnd{
    Node head;
    void deleteAtEnd(){
        if (head==null) {
            System.out.println("List is empty!");
        }
        if (head.next==null) {
            head=null;
            return;
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }
    void display(){
        Node a=head;
        while (a!=null) {
            System.out.print(a.data+"->");
            a=a.next;
        }
    }
}


public class Question06 {
    public static void main(String[]args){
       DeleteAtEnd list=new DeleteAtEnd();
       list.head=new Node(10);
       list.head.next=new Node(20);
       list.head.next.next=new Node(30);
       list.head.next.next.next=new Node(40);
       System.out.println("Before Deletion:");
       list.display();
       list.deleteAtEnd();
       System.out.println();
       System.out.println("After Deletion:");
       list.display();
    }
}
