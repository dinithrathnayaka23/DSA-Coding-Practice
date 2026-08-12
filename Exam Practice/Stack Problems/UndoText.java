/*
2. Undo Feature in a Text Editor

You are creating a simple text editor. Every time a user performs an editing operation, the previous state of the text should be saved.

For example:

"Hello"
"Hello World"
"Hello World!"
"Hello World! How are you?"

If the user presses Undo, the text should return to:

"Hello World!"

Another Undo:

"Hello World"

Another Undo:

"Hello"
Your task

Implement an Undo system using a Stack.

Your program should support:

Adding/modifying text
Undoing the most recent modification
Displaying the current text
Handling the situation where there is nothing left to undo

Challenge: Don't simply store individual characters. Think about how you can store the previous states of the document.
*/
class NodeAA{
    String text;
    NodeAA next;

    NodeAA(String text){
        this.text=text;
        this.next=null;
    }
}

class UndoList{
    NodeAA top;

    void addText(String text){
        NodeAA newText=new NodeAA(text);
        newText.next=top;
        top=newText;
    }
    String undoText(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        String text=top.text;
        top=top.next;
        return text;
    }
    String peek(){
       if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
       }
       return top.text;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }
        NodeAA temp=top;
        while (temp!=null) {
            System.out.println(temp.text);
            temp=temp.next;
        }
    }
    boolean isEmpty(){
        return top==null;
    }
}


public class UndoText {
    public static void main(String[] args) {
        UndoList obj=new UndoList();
        obj.addText("Hello");
        obj.addText("Hello Sumdu");
        obj.addText("I love you");
        obj.display();
        obj.undoText();
        obj.display();
    }
}
