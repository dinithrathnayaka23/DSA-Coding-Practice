/*
1. Browser Back Button

You are building a simple web browser. Every time a user visits a new page, the current page should be remembered so that the user can press Back and return to the previously visited page.

For example, the user visits:

Google → YouTube → GitHub → StackOverflow

If the user presses Back, they should return to GitHub.

If they press Back again, they should return to YouTube.

Your task

Implement this functionality using a Stack.

Your program should allow the user to:

Visit a new webpage.
Go back to the previous webpage.
Display the current webpage.
Display an appropriate message when there is no previous page to go back to.

Example interaction:

Visit: Google
Visit: YouTube
Visit: GitHub

Current page: GitHub

Back
Current page: YouTube

Back
Current page: Google

Back
No previous page available

Try to think about what information needs to be stored and when it should be removed.
*/
class NodeBB{
    String page;
    NodeBB next;

    NodeBB(String page){
        this.page=page;
        this.next=null;
    }
}

class BrowserHistory{
    NodeBB top;

    void visit(String page){
        NodeBB newNode=new NodeBB(page);
        newNode.next=top;
        top=newNode;
    }
    String back(){
        if (isEmpty()) {
            System.out.println("History is Empty!");
            return null;
        }
        String page=top.page;
        top=top.next;
        return page;
    }
    String seeCurrent(){
        if (isEmpty()) {
            System.out.println("History is empty!");
        }
        return top.page;
    }
    boolean isEmpty(){
        return top==null;
    }
    void display(){
        if (isEmpty()) {
            System.out.println("History is empty!");
        }
        NodeBB temp=top;
        System.out.println("Browser History:");
        while (temp!=null) {
            System.out.println(temp.page);
            temp=temp.next;
        }
    }

}

public class BrowserBack {
    public static void main(String[] args) {
        BrowserHistory obj=new BrowserHistory();
        obj.visit("Google");
        obj.visit("Youtube");
        obj.visit("Github");
        obj.display();
        obj.back();
        obj.display();
        System.out.println(obj.seeCurrent());

    }
}
