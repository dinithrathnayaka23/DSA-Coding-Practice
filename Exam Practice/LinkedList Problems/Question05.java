/*
Delete First Node
*/

public class Question05 {
    public static void main(String[]args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        Node temp=head;
        System.out.println("Before Deletion:");
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        head=head.next;
        Node a=head;
        System.out.println();
        System.out.println("After Deletion:");
        while (a!=null) {
            System.out.print(a.data+"->");
            a=a.next;
        }
    }
}
