public class ThreadDaemon extends Thread 
{
    public void run() 
    {
        if (Thread.currentThread().isDaemon()) 
        {
            System.out.println("Daemon Thread work");
        } 
        else 
        {
            System.out.println("User thread work");
        }
    }

    public static void main(String args[]) 
    {
        ThreadDaemon t1 = new ThreadDaemon(); // creating thread
        ThreadDaemon t2 = new ThreadDaemon();
        ThreadDaemon t3 = new ThreadDaemon();
        t1.setDaemon(true); // now t1 is Daemon thread
        t1.start(); // starting threads
        t2.start();
        t3.start();
    }
}
