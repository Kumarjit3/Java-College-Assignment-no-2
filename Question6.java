import java.util.Scanner;

public class Question6 
{
    public static void main(String[] args) 
    {
        int N=0,i=1,sum=0;
        for(String str : args)
        {
            N = Integer.parseInt(str);
        }

        Scanner sc = new Scanner(System.in);
        while(i<=N)
        {
            System.out.print("\nEnter integer number "+i+" : ");
            int Number = sc.nextInt();
            sum+=Number;
            i++;
        }
          
        System.out.print("\nThe sum of "+N+" integer numbers is : "+sum+"\n\n");
        sc.close();
    }
}
