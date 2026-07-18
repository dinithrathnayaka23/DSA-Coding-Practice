/*
Insert at Position
*/

public class Question04 {
    public static void main(String[]args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        Node a=head;
        System.out.println("Before Insertion:");
        while (a!=null) {
            System.out.print(a.data+"->");
            a=a.next;
        }
        int insertPosition=3;
        int insertElement=35;
        Node newNode=new Node(insertElement);
        Node current=head;
        for (int i = 0; i < insertPosition-1; i++) {
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
        System.out.println();
        System.out.println("After Insertion:");
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
