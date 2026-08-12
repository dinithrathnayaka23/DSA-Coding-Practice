/*
5. Hospital Patient Queue — Array Operations

A hospital stores patient registration numbers in an array according to their arrival order:

[201, 205, 209, 213, 217, 221]

The hospital needs a simple system that allows staff to:

Insert a new patient at a specified position.
Delete a patient using their registration number.
Search for a patient's registration number.
Display all currently registered patients.

For example, if patient 215 needs to be inserted at position 4, the elements after that position must be shifted accordingly.

Implement all three array operations yourself without using built-in collection classes.
*/

public class HospitalPatient {
    public static void insertPatient(int patient[],int patientID,int position,int size){
        for (int i =size; i>position;i--) {
            patient[i]=patient[i-1];
        }
        patient[position]=patientID;
    }
    public static void delete(int patientID,int patient[],int deleteIndex){
        deleteIndex=-1;
        for (int i =0; i <patient.length-1; i++) {
            if(patient[i]==patientID){
                patient[i]=patient[i+1];
                break;
            }
        }
    }
    public static void search(int patientID,int patient[]){
        for (int i = 0; i <patient.length; i++) {
            if (patient[i]==patientID) {
                System.out.println("Patient Found: "+patientID);
            }
        }
    }
    public static void display(int patient[]){
        for (int i = 0; i < patient.length; i++) {
            System.out.println(patient[i]+" ");
        }
    }
    public static void main(String[]args){
        int patient[]=new int[7];
        patient[0]=201;
        patient[1]=205;
        patient[2]=209;
        patient[3]=213;
        patient[4]=217;
        patient[5]=221;
        int size=6;
        insertPatient(patient, 210, 3, size);
        display(patient);
        System.out.println();
        delete(209, patient,2);
        display(patient);
        System.out.println();
        search(217, patient);
    }
}
