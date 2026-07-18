/*
Insert at Beginning
*/

public class Question02 {
    public static void main(String[]args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        Node a=head;
        System.out.println("Before Insertion at Begining:");
        while (a!=null) {
            System.out.print(a.data+"->");
            a=a.next;
        }
        int insertElement=15;
        Node newNode=new Node(insertElement);
        newNode.next=head;
        head=newNode;
        Node temp=head;
        System.out.println();
        System.out.println("After Insertion at Begining:");
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
}
