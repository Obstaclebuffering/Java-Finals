import java.io.*;
import java.util.*;

public class FinalsArrays{
   static Scanner sc = new Scanner(System.in);
   static int[] array;
   static int idx;
   static int size;
   static int cnt;
   public FinalsArrays(int _size)
   {
      size = _size;
      array = new int[size];
      idx = -1;
      cnt = 0;
      
   }
   static boolean isFull()
   {
      return cnt >= size;
   }
   static boolean isEmpty()
   {
      return cnt <= 0;
   }
   static void add(int value)
   {
      if(!isFull())
      {
         array[++idx] = value;
         cnt++;
      }
      else
      {
         System.out.println("Array is full!");
      }
 
   }
   static void remove()
   {
      //Add code here to remove an element in the array
      array[idx] = 0;
      cnt--;
      size--;
      
   }
   static int count()
   {
      return cnt;
   }
   static void search(int value)
   { 
       //Add code here to search an element in the array  
       int temp=0;
       for(int i=0; i < size; i++){
          if( array[i] == value ){
           System.out.println("Item Found!");
           temp=1;
          }
          else{
           System.out.println("Item Not Found!");
           temp=1;
          }
       }
   }
   static void display()
   {
      for(int i = 0;i < cnt; i++)
      {
         System.out.println( "[" + array[i]  + "]");
      }   
   }
   public static void main(String[]args)
   {
      int _size, opt=0, value;
      System.out.print("Input array size: ");
      _size = sc.nextInt();
      FinalsArrays aa = new FinalsArrays(_size);
      while(opt <= 6){
      System.out.println("1. ADD  2. DISPLAY    3. DELETE     4. COUNT    5. SEARCH      6. EXIT ");
      System.out.print("Enter Option: ");
      opt = sc.nextInt();
      
      
      switch(opt)
      {
         case 1: for(int i = 0; i <_size; i++)
               {
                 System.out.print("Add value: ");
                 value = sc.nextInt();
                 add(value);
               }
               break;
            //Add code to complete the switch case
         case 2:  display();break;
         case 3:remove();break;
         case 4:System.out.println("Total Count: "+count());
         break;
         
         case 5:
             System.out.println("Enter number to be search");
             int x = sc.nextInt();
             search(x);break;
         case 6:System.out.print("Program Terminated! Thank you");
             System.exit(0);break;
         default: System.out.println("Thank you!");
      }
      }

   }
}