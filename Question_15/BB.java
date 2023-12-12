package Question_15;

public class BB extends AA
{
      public static int a = a1;
      private float f = f1;   
    //  protected String s = s1;   //error we can not use private s1
      boolean b = b1;

    public void showa()
    {
      System.out.print("\na : "+a);
    //  DisplayA1();  //error
      DisplayB1();
      Displayf1();
      DisplayS1();
    }

    private static void showb()
    {
      System.out.print("\nb : "+a);
     // DisplayA1();  //error we can not use private method DisplayA1()
     // DisplayB1();
     // Displayf1();
     // DisplayS1();
    }

     protected void showf()
    {
      System.out.print("\nf : "+f);
     // DisplayA1();  //error we can not use private method DisplayA1()
      DisplayB1();
      Displayf1();
      DisplayS1();
    }

    void shows()
    {
     // System.out.print("\ns : "+s);  // unable to inisialize s memeber
     // DisplayA1();  //error we can not use private method DisplayA1()
      DisplayB1();
      Displayf1();
      DisplayS1();
    }

    public static void main(String[] args) 
    {
       showb();
       System.out.println("hello2 Kumarjit");    
    }
}