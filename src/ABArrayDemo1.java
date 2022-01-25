import java.util.*;
public class ABArrayDemo1 {
    static int arr[];  //Class variable
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   arr=new int[5];  //if not used null pointer exception
     for(int i=0;i<ABArrayDemo1.arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
     for(int res:arr)  //no need to define classname ABArrayDemo1.arr
        {                    
            System.out.println(res);
        }
}
    
}
