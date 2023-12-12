import java.util.Scanner;

public class Question16 
{
   public static void main(String[] args)
   {
        System.out.print("\n\n");
       Scanner sc = new Scanner(System.in);
       int Numerator;
       int Denumerator;
       int Result=0;
       int i=0;

       System.out.print("\nEnter The Numerator : ");
       Numerator = sc.nextInt();

       System.out.print("\nEnter The Denumerator : ");
       Denumerator = sc.nextInt();

       sc.close();

       try
       {

         if(Denumerator == 0)
         {
            ++i;
            throw new ArithmeticException("Divided by zero exception");
         }
         else
         {
            Result = Numerator / Denumerator;
         }

       }
       catch(ArithmeticException e)
       {
           System.out.print("\nThe Exception is  : "+e+"\n");
       }

       if(i == 0)
       {
           System.out.print("\nThe Result is  : "+Result+"\n");
       }

        System.out.print("\n\n");
   }
}
