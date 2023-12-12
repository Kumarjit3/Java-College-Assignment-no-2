public class Question1 
{
    public static void main(String[] args) 
    {
        System.out.print("\n\n");
        int sum=0,i=0;
        for(String str : args)
        {
            int n = Integer.parseInt(str);
            sum+=n;
            i++;
        }
          System.out.print("\nSum of "+i+" command line integers is : "+sum+"\n\n");
    }
}
