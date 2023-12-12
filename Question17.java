public class Question17 
{
   public static void main(String[] args)
   {
      System.out.print("\n\n");
       try
       {
           try
           {
               try
               {
                  int arr[] = {3,6,9,12,15};

                    arr[9] = 123; //inserting 123 in arr at out of its size 
               }
               catch(ArithmeticException e1)
               {
                  System.out.print("\nAn arithmetic exception occurs : "+e1+" \n");
               }
           }
           catch(ArithmeticException e2)
           {
               System.out.print("\nAn arithmetic exception occurs : "+e2+" \n");
           }
       }
       catch(ArrayIndexOutOfBoundsException e3)
       {
           System.out.print("\nArray index out of bound exception : "+e3+" \n");
       }

       catch(Exception e4)  //if rest of all three catch block can not able to catch the exception that time it works
       {
          System.out.print("\nSomething wents wrong : "+e4+" \n\n");
       }

        System.out.print("\n\n");
   }   
}
