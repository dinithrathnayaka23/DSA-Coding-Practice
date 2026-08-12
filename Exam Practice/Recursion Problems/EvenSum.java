import java.util.Scanner;

public class EvenSum {
    public static int sumEven(int n){
        if (n==0) {
            return 0;
        }
        else{
            return 2*n+sumEven(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();
        System.out.println("Sum: "+sumEven(n));
    }
}
