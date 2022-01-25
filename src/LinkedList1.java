//to add a value at given index of array by left shift
public class LinkedList1 {
         public static void main(String[] args) {
         int arr[]={10,20,30,40,50};
         int index=2;
         int value=100;
         for(int i=0;i<index;i++)
         {
             arr[i]=arr[i+1];
             
         }
         arr[index]=value;
         for(int i:arr)
         {
             System.out.println(i);
         }
         

}
}
