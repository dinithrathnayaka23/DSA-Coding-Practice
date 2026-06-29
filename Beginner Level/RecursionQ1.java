import java.util.Scanner;

class SumOfDigits{
    void iteration(int num){
        int sum=0;
        while (num!=0) {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("Iterative Sum of Digits: "+sum);
    }
    int recursion(int num){
        if (num==0) {
            return 0;
        }
        return (num%10)+recursion(num/10);
    }
}

public class RecursionQ1 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a postive integer: ");
        num=sc.nextInt();
        SumOfDigits obj=new SumOfDigits();
        int sum=obj.recursion(num);
        System.out.println("Recursive Sum of Digits: "+sum);
        obj.iteration(num);
    }
}
