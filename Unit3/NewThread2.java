public class NewThread2 extends Thread 
{
    NewThread2()
    {
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
        start();
    }

    public void run()
    {
        try
        {
            for(int n = 5; n > 0; n--)
            {
                System.out.println("Child thread :"+n);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }

    public static void main(String args[])
    {
        new NewThread2();
        try
        {
            for(int n = 5; n > 0; n--)
            {
                System.out.println("Main Thread :"+n);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");
    }
}
