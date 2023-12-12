import java.util.Scanner;

public class Question2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter a positive integer : ");
        int num = sc.nextInt();

        long fact=1; int i=num;
        while(i!=1)
        {
           fact*=i;
           i=i-1;
        }
    
        System.out.print("\n\nFactorial of integer "+num+" is : "+fact+"\n\n");
        sc.close();
    }
}
