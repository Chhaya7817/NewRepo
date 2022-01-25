
import java.util.Scanner;

public class Stu1
{
    private int rollno;
    private String name;
    private int marks;
    public String getName()
    {
        return name;
    }
    public int getRollno()
    {
        return rollno;
    }
    public int getMarks()
    {
        return marks;
    }
    Stu1(int rollno,String name,int marks)
    {
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    
}
class Test23{
    public static void main(String[] args) {
        Stu1 arr[]=new Stu1[5];
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
            arr[i]=new Stu1(rollno,name,marks);
        }
        int max=0;
        int min=0;
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i].getName());
             if(arr[i].getMarks()>arr[max].getMarks())
                max=i;
            if(arr[i].getMarks()<arr[min].getMarks())
                min=i;
            System.out.println(arr[i].getRollno()+" "+arr[i].getName());
        }
        System.out.println("Maximum marks = " + arr[max].getMarks()+" Obtained by "+arr[max].getName());
        System.out.println("Maximum marks = " + arr[min].getMarks()+" Obtained by "+arr[min].getName());

    }
    
}
