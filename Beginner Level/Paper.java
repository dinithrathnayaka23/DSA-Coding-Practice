class Node_P{
    String name;
    int p_id;
    float temp;
    Node_P next;

    Node_P(String name,int p_id,float temp){
        this.name=name;
        this.p_id=p_id;
        this.temp=temp;
        this.next=null;
    }
}

class PatientLinkedList{
    Node_P head;

    void insertAtEnd(String name,int p_id,float temp){
        Node_P newPatient=new Node_P(name, p_id, temp);
        Node_P b=head;
        while (b.next!=null) {
            b=b.next;
        }
        b.next=newPatient;
    }

    void deleteAtHead(){
        if (head==null) {
            System.out.println("Patient list is empty!");
            return;
        }
        head=head.next;
    }
    void searchByID(int id){
        Node_P a=head;
        while (a!=null) {
            if (a.p_id==id) {
                System.out.println("Patient found!");
                System.out.println("Name: "+ a.name);
                System.out.println("Patient ID: "+a.p_id);
                System.out.println("Temperature: "+a.temp);
                return;
            }
            a=a.next;
        }
        System.out.println("Patient not found!");
    }
    void displayFever(){
        Node_P c=head;
        boolean found=false;
        while (c!=null) {
            if (c.temp>38.0) {
                System.out.println("Name: "+c.name);
                System.out.println("Patient_id: "+c.p_id);
                System.out.println("Temperature: "+c.temp);
                return;
            }
            c=c.next;
        }
        if (!found) {
            System.out.println("No fewer cased found!");
        }
    }
}


public class Paper {
    public static void main(String[] args) {
        PatientLinkedList list = new PatientLinkedList();

        list.insertAtEnd("Dinith Rathnayaka", 101, 37.2f);
        list.insertAtEnd("Nikini Muthugala", 102, 39.1f);
        list.insertAtEnd("Geethma Rathnayaka", 103, 38.5f);

        System.out.println("Search Patient:");
        list.searchByID(102);

        System.out.println("\nFever Cases:");
        list.displayFever();

        System.out.println("\nDeleting first patient...");
        list.deleteAtHead();

        System.out.println("\nPatients with Fever After Deletion:");
        list.displayFever();
    }
}
