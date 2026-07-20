/*
Browser Back Button
Maintain visited pages.
*/
class NodeS{
    String str;
    NodeS next;

    NodeS(String str){
        this.str=str;
        this.next=null;
    }
}

class StackBrowser{
    NodeS top;

    void push(String str){
        NodeS newNode=new NodeS(str);
        newNode.next=top;
        top=newNode;
        return;
    }
    String pop(){
        if (isEmpty()) {
            System.out.println("Browser history is empty!");
            return null;
        }
        System.out.println("Brower Backed!");
        String str=top.str;
        top=top.next;
        return str;
    }
    String peek(){
        System.out.println("Most recent visited:");
        return top.str;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("Browser History is empty!");
        }
        NodeS temp=top;
        System.out.println("Browser History:");
        while (temp!=null) {
            System.out.println(temp.str);
            temp=temp.next;
        }
    }
    boolean isEmpty(){
        return top==null;
    }
}

public class Question05 {
    public static void main(String[]args){
        StackBrowser obj=new StackBrowser();
        obj.push("Google.com");
        obj.push("Youtube.com");
        obj.push("Spotify.com");
        obj.push("Linkedin.com");
        obj.display();
        System.out.println(obj.peek());
        obj.pop();
        obj.pop();
        obj.display();
    }
}
