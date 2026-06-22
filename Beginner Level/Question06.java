class Node_A{
    String data;
    Node_A next;

    Node_A(String data){
        this.data=data;
        this.next=null;
    }
}

class UndoLinkedStack{
    Node_A top;

    void addText(String text){
        Node_A newNode=new Node_A(text);
        newNode.next=top;
        top=newNode;
        System.out.println(text+" is added!");
    }
    String undoText(){
        if (isEmpty()) {
            System.out.println("No texts!");
        }
        String text=top.data;
        top=top.next;
        return text;
    }
    String peek(){
        if (isEmpty()) {
            System.out.println("No Texts!");
        }
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
    void display(){
        Node_A temp=top;
        System.out.println("Currently Existing Texts:");
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class Question06 {
    public static void main(String[] args) {
        UndoLinkedStack ur=new UndoLinkedStack();
        ur.addText("Dinith");
        ur.addText("Nikini");
        ur.addText("Geethma");
        ur.addText("Nemina");
        ur.display();
        ur.undoText();
        ur.undoText();
        ur.display();
    }
}
