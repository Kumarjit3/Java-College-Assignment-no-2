import java.util.Scanner;

public class Question5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a positive integer : ");
        int num = sc.nextInt();

        int i=1,flag=0;
        while (i<=num) 
        {
            if(num%i == 0)
            {
               flag++;
            }
            i++;
        }

        if(flag == 2)
        {
            System.out.print("\nYes "+num+" is Prime\n\n");
        }
        else
        {
            System.out.print("\nNo "+num+" is not Prime\n\n");
        }

        sc.close();
    }
}
