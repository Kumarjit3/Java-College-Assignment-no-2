class Distance
{
    private int Inch;
    private int Feet;

    public Distance() //Default Constructor
    {
         Inch=13;
         Feet=11;
    }

    public Distance(int Feet,int Inch) //Parameterized Constructor
    {
        this.Inch=Inch;
        this.Feet=Feet;
    }

    public Distance(Distance d)  //Copy Constructor
    {
        Inch = d.Inch;
        Feet =d.Feet;
    }

    public void setInch(int Inch)  //Seter
    {
       this.Inch=Inch;
    }

    public void setFeet(int Feet)  //Seter
    {
        this.Feet=Feet;
    }

    public void showInch()  //ShowMethod
    {
        System.out.println("\nThe Inch Distance Is : "+Inch+"\n");
    }

        public void showFeet()  //ShowMethod
    {
        System.out.println("\nThe Feet Distance Is : "+Feet+"\n");
    }

}


public class Question8_9 
{
    public static void main(String[] args) 
    {
        Distance d1 = new Distance(3,4);
        Distance d2 = new Distance(33,22);
        Distance d3 = d2;
        Distance d4 = new Distance(d1); //Cloneing First Object
        d1.showFeet();
        d1.showInch();
        d2.showFeet();
        d2.showInch();
        d3.showFeet();
        d3.showInch();
        d4.showFeet();
        d4.showInch();
    }
}
