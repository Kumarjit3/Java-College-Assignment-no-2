public class Question10 
{
    static int i=1;
    public static void showA(int a)
    {
        System.out.println("  |\"Automatic converted into\"|  int -> "+a+"\n");
    }
 
    public static void showA(Object a)
    {
        System.out.println("  |\"Automatic converted into\"|  Object -> "+a+"\n");
    }

    public static void main(String[] args)
    {
        System.out.print("\n\t.....Java Automatic Convertion......\n");

        int a=3;
        System.out.print("\n"+(i++)+". int -> "+a);
        showA(a);

        double d=3.3333;
        System.out.print("\n"+(i++)+". double -> "+d);    //Automatic type Convertion
        showA(d);  
 
        char c='K';
        System.out.print("\n"+(i++)+". char -> "+c);     //Automatic type Convertion
        showA(c);  

        long l=23456789123l;
        System.out.print("\n"+(i++)+". long -> "+l);     //Automatic type Convertion
        showA(l);  

        float f=13.3f;
        System.out.print("\n"+(i++)+". float -> "+f);     //Automatic type Convertion
        showA(f);  

        System.out.print("\n\n");
    }
}
