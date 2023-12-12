class Specify 
{
    final double pie = 3.14159;  //final variables can not be modified
                                        
    private int x;               //private memebers can't be accessed out side of the class
    public double radius;        //public members can be accessed from anywhere
    
    public void setX(int x)      //By using public method we access private member from outside of the class
    {
         this.x = x;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea(double radius)  //public method 
    {
        this.radius=radius;
        return (pie*(Math.pow(radius,2)));
    }
}

public class Question11 
{
    public static void swap(int a,int b)
    {
         int c=a;
         a=b;
         b=c;
         System.out.print("\nWithin swap function primitive type variable A : "+a+"\n");
         System.out.print("\nWithin swap function primitive type variable B : "+b+"\n");
    }
    public static void main(String[] args) 
    {
        Specify s1 = new Specify();

        // s1.x=9;          //Here we are not able to access private member x
           s1.setX(9);    //Here we access private member by using public method
           s1.radius=3.4;   //here we are able to access public member radius
        // s1.pie+1;        //here we can not modify pie memeber because it is final

        int A=3,B=6;
        System.out.print("\n\nBefore calling swap function, primitive type variable A : "+A+"\n");
        System.out.print("\nBefore calling swap function, primitive type variable B : "+B+"\n");
        swap(A,B);
        System.out.print("\nAfter calling swap function, primitive type variable A : "+A+"\n");
        System.out.print("\nAfter calling swap function, primitive type variable B : "+B+"\n");
        System.out.print("\nAfter swapping primitive type variables are remain the same just because they are call by value\n\n");

        System.out.print("\nBefore calling setRadius method s1 object member radius : "+s1.radius+"\n");
        s1.setRadius(33.34);
        System.out.print("\nAfter calling setRadius method s1 object member radius : "+s1.radius+"\n");
        System.out.print("\nAfter setRadius object type members are changed just because they are call by reference\n\n\n");
    }
}
