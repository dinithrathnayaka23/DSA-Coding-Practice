/*
3. Employee Database — Deletion

A company's employee system stores employee IDs:

[1001, 1005, 1010, 1015, 1020, 1025]

Employee 1015 leaves the company.

Write a program to search for employee ID 1015 and delete it from the array.

Your program should:

Search for the employee ID.
Determine its position.
Shift the elements after it to the left.
Update the logical size of the array.
Display the updated employee list.

If the employee ID doesn't exist, display an appropriate message.
*/

public class EmployeeDatabase {
    public static void main(String[]args){
        int employeeID[]=new int[6];
        employeeID[0]=1001;
        employeeID[1]=1005;
        employeeID[2]=1010;
        employeeID[3]=1015;
        employeeID[4]=1020;
        employeeID[5]=1025;
        int deleteId = 1015;
        int index = -1;
        for (int i = 0; i < employeeID.length; i++) {
            if (employeeID[i] == deleteId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee ID " + deleteId + " not found.");
            return;
        }

        for (int i = index; i < employeeID.length - 1; i++) {
            employeeID[i] = employeeID[i + 1];
        }

        int logicalSize = employeeID.length - 1;
        System.out.println("Updated employee list:");
        for (int i = 0; i < logicalSize; i++) {
            System.out.println(employeeID[i]);
        }
    }
}
