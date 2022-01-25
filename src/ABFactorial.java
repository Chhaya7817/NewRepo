
import java.util.Scanner;

public class ABFactorial {
    public long factorial(int n)
    {
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        ABFactorial obj=new ABFactorial();
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   long fact=obj.factorial(n);
        System.out.println("factorial="+fact);
}
    
}
