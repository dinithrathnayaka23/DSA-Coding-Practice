/*
Insert at End
*/

public class Question03{
    public static void main(String[]args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        Node b=head;
        System.out.println("Before Insertion at End:");
        while (b!=null) {
            System.out.print(b.data+"->");
            b=b.next;
        }
        int insertElement=50;
        Node newNode=new Node(insertElement);
        Node a=head;
        while (a.next!=null) {
            a=a.next;
        }
        a.next=newNode;
        Node temp=head;
        System.out.println();
        System.out.println("After Insertion at End:");
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}