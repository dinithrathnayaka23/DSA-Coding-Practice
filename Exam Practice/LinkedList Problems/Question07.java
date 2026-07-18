/*
Reverse Linked List
*/

public class Question07 {
    public static void main(String[]args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        Node temp=head;
        System.out.println("Original LinkedList:");
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        Node prev=null;
        Node current=head;
        Node next=null;
        while (current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        System.out.println();
        Node b=head;
        System.out.println("Reversed LinkedList:");
        while (b!=null) {
            System.out.print(b.data+"->");
            b=b.next;
        }
    }
}
