import java.util.*;
public class ABArrayDemo {
   // int arr[]=new int[5];   instance variables do not allocate memory
    int arr[];
    public ABArrayDemo()
    {
        Scanner sc=new Scanner(System.in);
        arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public static void main(String[] args) 
    {
        ABArrayDemo obj=new ABArrayDemo();
        for(int res:obj.arr)   //perform traversal operation 
        {                      //only for readable purposes
            System.out.println(res);
        }
}
}
