class A implements Runnable
{
    public synchronized void run()
    {
        for(int i=0; i<100; i++)
        {
            System.out.print("\nHi There......\n");
            try{ 
            Thread.sleep(5); 
             }catch(Exception e) { e.printStackTrace(); }
        }
    }

    public void DisplayS1() {
    }
}

class B implements Runnable
{
    public synchronized void run()
    {
        for(int i=0; i<100; i++)
        {
            System.out.print("\nHello There......\n");
            try{ 
            Thread.sleep(5); 
            }catch(Exception e) { e.printStackTrace(); }
        }
    }
}

public class Question19 
{
    public static void main(String[] args) throws InterruptedException
    {
         Runnable a1 = new A();
         Runnable b1 = new B();

         Thread t1 = new Thread(a1);
         Thread t2 = new Thread(b1);

         System.out.print("\nDefault Priority Of Thread t1 : "+t1.getPriority());
         System.out.print("\nDefault Priority Of Thread t2 : "+t2.getPriority());

         t2.setPriority(9);  //Setting new Priority of Thread t2
         t1.setPriority(6);  //Setting new Priority of Thread t1

         System.out.print("\nUpdated Priority Of Thread t1 : "+t1.getPriority());
         System.out.print("\nUpdated Priority Of Thread t2 : "+t2.getPriority());

         t1.start();
         t2.start();

         t1.join();
         t2.join();

         System.out.print("\nCurrent Running Thread is : "+Thread.currentThread().getName());
         System.out.print("\nPriority Of That Thread is : "+Thread.currentThread().getPriority());

         Thread.currentThread().setPriority(10); //Here we setting main Thread priority
         System.out.print("\nUpdated Priority Of The Main Thread is : "+Thread.currentThread().getPriority()+"\n\n");

    }
}
