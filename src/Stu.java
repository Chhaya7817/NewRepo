
import java.util.Scanner;

public class Stu 
{
    int rollno;
    String name;
    int marks;
    Stu(int rollno,String name,int marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    
}
class Test234{
    public static void main(String[] args) {
        Stu arr[]=new Stu[5];
        int rollno;
        String name;
        int marks;
        Scanner sc=new Scanner(System.in); 
    //    arr[0]=new Stu(1,"Ramesh");
     //   System.out.println(arr[0].name);
        for(int i=0;i<5;i++)
        {
            rollno=sc.nextInt();
            name=sc.next();
            marks=sc.nextInt();
            arr[i]=new Stu(rollno,name,marks);
        }
        int max=0;
        int min=0;
        for(int i=1;i<5;i++)
        {
            if(arr[i].marks>arr[max].marks)
                max=i;
            if(arr[i].marks<arr[min].marks)
                min=i;
            System.out.println(arr[i].rollno+" "+arr[i].name);
        }
        System.out.println("Maximum marks = " + arr[max].marks+" Obtained by "+arr[max].name);
        System.out.println("Maximum marks = " + arr[min].marks+" Obtained by "+arr[min].name);

    }
    
}
