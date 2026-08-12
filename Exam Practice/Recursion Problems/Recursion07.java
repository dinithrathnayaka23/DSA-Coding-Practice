import java.util.Scanner;

public class Recursion07 {
    public static int iteration(int n){
        int sum=0;
        while (n!=0) {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static int recursive(int n){
        if (n==0) {
            return 0;
        }
        else{
            return n%10+recursive(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n=sc.nextInt();
        System.out.println("Recursive Sum of Digits: "+recursive(n));
        System.out.println("Iterative Sum of Digits: "+iteration(n));
    }
}
