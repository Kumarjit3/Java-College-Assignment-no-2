import java.util.ArrayList;
import java.util.Scanner;
import Question_14.*;

public class Question14 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
        
         System.out.print("\nEnter any positive integer :- ");
         int num = sc.nextInt();

         GetFibonacci G1 = new GetFibonacci();
         ArrayList<Integer> arr = G1.getFibonacci(num);
         
         System.out.print("\n");
         for(int a : arr)
         {
            System.out.print(" "+a+" ");
         }
         
        sc.close();
   }    
}
