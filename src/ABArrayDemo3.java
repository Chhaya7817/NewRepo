import java.util.*;
public class ABArrayDemo3 {
    int arr[]=null;  //arrays are reference datatype so can be declared as null
    public ABArrayDemo3()
    {
        arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int value,int index)
    {
        try{
            if(arr[index]==Integer.MIN_VALUE)
            {
                arr[index]=value;
            }
            else
            {
                System.out.println("Already Filled");
            }
        }catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Invalid Index");
        }
    }
    //metghod tyo traverse tyhe arraty
    //to print all the vaues stored in array
    public void traverse()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    //to print specific value
    public void indexvalueprint(int index)
    {
        try{
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Invalid Index");
        }
    }
    //method to search a value in the given array
    public void searchinarray(int searchvalue)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==searchvalue)
            {
                System.out.println("Value found ");
                return;
            }
        }
        System.out.println("Nio Martch Found");
    }
    //mathod to delete a value from array
    //user can provide index or value
    public void deletevalue(int index)
    {
        try
        {
            arr[index]=Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Invalid Index!!!");
        }
    }
    //Delete the complete array
    public void deletearray()
    {
        arr=null;  //completely delete the array as array is reference datatype
    }
    
    
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in); 
           ABArrayDemo3 obj =new ABArrayDemo3();
           obj.traverse();
           obj.insert(56, 2);
           System.out.println("After insertion");
           obj.traverse();
           obj.deletevalue(2);
           System.out.println("After deletion");
           obj.traverse();
                   
                   
    }
    
}
