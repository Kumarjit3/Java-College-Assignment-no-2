import java.util.Scanner;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str); //Calling the parameterized constructor of exception class
    }
}

public class Question18 
{

    public static void Eligibility(int Age) throws InvalidAgeException 
    {
         if(Age < 18)
         {
            throw new InvalidAgeException("\nYour age is lessthen 18 thats why you are not eligible for Vote\n");
         }
         else
         {
            System.out.print("\nYou are eligible for Vote\n");
         }
    }
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);

         System.out.print("\nEnter Your Age : ");
         int Age = Integer.parseInt(sc.nextLine());

         try
         {
            Eligibility(Age);  //checking age is valid or not
         }
         catch(InvalidAgeException e)
         {
            System.out.print("\nException is : "+e+"\n");  //printing the exception
         }

         System.out.print("\n\n");
         sc.close();
    }
}
