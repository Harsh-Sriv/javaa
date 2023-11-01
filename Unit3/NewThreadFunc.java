public class NewThreadFunc implements Runnable 
{
    String name;
    Thread t;

    NewThreadFunc (String threadname)
    {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }

    public void run(){
        try
        {
            for(int n = 5; n > 0; n--)
            {
                System.out.println(name + ": " + n);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting");

    }

    public static void main(String args[])
    {
        NewThreadFunc ob1 = new NewThreadFunc("One");
        NewThreadFunc ob2 = new NewThreadFunc("Two");
        NewThreadFunc ob3 = new NewThreadFunc("Three");

        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());
        try{
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " + ob3.t.isAlive());
        System.out.println("Main thread exiting");
    }
}
