import java.util.Scanner;

public class Question3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size]; int i=0,sum=0;
        System.out.print("\nEnter "+size+" array elements : \n");
        while(i<size)
        {
           System.out.print("\nArr["+i+"] : ");
           arr[i] = sc.nextInt();
           i++;
        }

        i=0;
        System.out.print("\nThe array elements are : \n");
        while(i<size)
        {
           System.out.print("\nArr["+i+"] : "+arr[i]);
           sum+=arr[i++];
        }
        System.out.print("\n\nThe sum of all "+size+" array elements is : "+sum+"\n\n");
        sc.close();
    }
}
