package Question_15;

public class AA
{
    //Instance members of class AA

    private String s1 = "Kumarjit";
    public static int a1 = 103;
    protected boolean b1 = false;
    float f1 = 303.3f;

    //Instance methods of class A

    public void DisplayS1()
    {
        System.out.print("\nString s1 = "+s1); 
    }

    private static void DisplayA1() 
    {
        System.out.print("\nInt a1 = "+a1); 
    }

    protected void DisplayB1()
    {
        System.out.print("\nboolean b1 = "+b1); 
    }

    void Displayf1()
    {
        System.out.print("\nfloat f1 = "+f1); 
    }

    public static void main(String[] args) 
    {
       DisplayA1(); 
       System.out.println("hello1 Kumarjit");    
    }
}

