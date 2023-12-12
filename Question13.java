public class Question13
{
    public static void main(String[] args)
    {
       int num = 3;
       char cum = 'c';
       String sum = "Kumarjit";

       Integer i1 = Integer.valueOf(num);       //Boxing
       Integer i2 = Integer.valueOf("33");    //Boxing
       Integer i3 = 333;                        //Boxing
  
       Character c1 = Character.valueOf(cum);   //Boxing
       Character c2 = Character.valueOf('A'); //Boxing

       String s1 = new String("Hello"); //Boxing
       String s2 = new String(sum);              //Boxing

       int num1 = i1;     //UnBoxing
       int num2 = i2;     //UnBoxing
       int num3 = i3;     //UnBoxing
       char cum1 = c1;    //UnBoxing
       char cum2 = c2;    //UnBoxing
       String sum1 = s1;  //UnBoxing
       String sum2 = s2;  //UnBoxing
     
       System.out.print("\nInteger1 : "+num1);     //Printing
       System.out.print("\nInteger2 : "+num2);     //Printing
       System.out.print("\nInteger3 : "+num3);     //Printing
       System.out.print("\nCharacter1 : "+cum1);   //Printing
       System.out.print("\nCharacter2 : "+cum2);   //Printing
       System.out.print("\nString1 : "+sum1);      //Printing
       System.out.print("\nString2 : "+sum2);      //Printing

    }
}