
import java.util.Scanner;

public class TrailingZeroinFact {
    public static long factorial(int n)
    {
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) 
    {
        int n,zeros=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:::: ");
        n=sc.nextInt();
        long  fact=factorial(n);
        System.out.println("Factorial= "+fact);
        while(fact>0)
        {
            if(fact%10==0)
                zeros=zeros+1;
            else 
                break;
            fact=fact/10;
        }
        System.out.println("Number of Zeros = "+ zeros);
    }
    
}
