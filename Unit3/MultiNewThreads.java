class MultiNewTHread implements Runnable 
{
    String name;
    Thread t;

    MultiNewTHread(String threadname) 
    {
        name=threadname;
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
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }

    public static void main (String args[])
    {
        new MultiNewTHread("One");
        new MultiNewTHread("Two");
        new MultiNewTHread("Three");
        try
        {
                Thread.sleep(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");
    }
}