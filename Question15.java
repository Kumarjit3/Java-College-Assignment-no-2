import Question_15.*;

public class Question15
{
    public static void main(String[] args)
    {
       AA a1 = new AA();
         a1.DisplayS1();  //we can use public method outside of the class 
      // a1.DisplayA1();  //error we can not use private method outside of the class 
      // a1.DisplayB1();  //error we can not use protected method outside of the class 
      // a1.Displayf1();  //error we can not use default method outside of the class 
   
         System.out.print("\na1 : "+AA.a1+"\n");  //we can use public member outside of the class 
      // System.out.print("\na1 : "+a1.b1+"\n");  //error we can not use protected member outside of the class
      // System.out.print("\na1 : "+a1.f1+"\n");  //error we can not use private member outside of the class 
      // System.out.print("\na1 : "+a1.s1+"\n");  //error we can not use default member outside of the class

      BB b1 = new BB();
         b1.showa();  //we can use public method outside of the class 
      // b1.shows();  //error we can not use default method outside of the class 
      // b1.showb();  //error we can not use private method outside of the class 
      // b1.showf();  //error we can not use protected method outside of the class 
     
         System.out.print("\na1 : "+BB.a+"\n");  //we can use public member outside of the class  
      // System.out.print("\na1 : "+b1.b+"\n");  //error we can not use default member outside of the class
      // System.out.print("\na1 : "+b1.f+"\n");  //error we can not use private member outside of the class 
      // System.out.print("\na1 : "+b1.s+"\n");  //error we can not use protected member outside of the class
    }
}