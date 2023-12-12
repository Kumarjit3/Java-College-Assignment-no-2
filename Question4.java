import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Question4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("\nEnter a decimal number : ");
        int dec = sc.nextInt();
        
        while(dec > 1)
        {
            if(dec%2 == 0)
            {
               arr.add(0);
            }
            else
            {
                arr.add(1);
            }
            dec = dec/2;
        }
        arr.add(dec);

        Collections.reverse(arr);
        arr.forEach(System.out::print);

        sc.close();
    }
}
