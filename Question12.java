class std
{
    public static void function1(String... str)
    {
        System.out.print("\nNumber of arguments are : "+str.length);
        System.out.print("\nThe arguments values are : ");
        for(String st : str)
        {
            System.out.print(st+"  ");
        }
        System.out.print("\n");
    }

    public static void function2(int... itr)
    {
        System.out.print("\nNumber of arguments are : "+itr.length);
        System.out.print("\nThe arguments values are : ");
        for(int it : itr)
        {
            System.out.print(it+"  ");
        }
        System.out.print("\n");
    }
}

public class Question12 
{
    public static void main(String[] args) 
    {
        System.out.print("\n");
        std.function1("What do you want");
        std.function2(3);
        std.function1("Kumarjit","Neil","Manju","Niloy");
        std.function2(3,6,9,12,15);
        std.function1();
        std.function2();
        System.out.print("\n\n");
    }
}
