public class NewThread implements Runnable{
    Thread t;

    NewThread()
    {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
        t.start();
    }

    public void run()
    {
        try
        {
            for(int n = 5; n > 0; n--)
            {
                System.out.println("Child thread :"+n);
                Thread.sleep(400);
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
        new NewThread();
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
