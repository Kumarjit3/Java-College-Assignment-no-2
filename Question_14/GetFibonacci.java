package Question_14;
import java.util.ArrayList;

public class GetFibonacci
{
    ArrayList<Integer> a1 = new ArrayList<>();
    public ArrayList<Integer> getFibonacci(int n)
    {
         int a=1,b=-1,c,i=1;
        while(i<=n)
        {
           c = a+b;
           b = a;
           a = c;
           a1.add(c);
           i++;
        }
        return a1;
    }
}