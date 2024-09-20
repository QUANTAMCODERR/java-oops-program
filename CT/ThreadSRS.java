class SusResStop implements Runnable {
    private Thread thread;
    private boolean suspendFlag;
    private boolean stopFlag;

    SusResStop(String threadName) {
        thread = new Thread(this, threadName);
        suspendFlag = false;
        stopFlag = false;
        thread.start();
    }

    public void run() {
        try {
            int j = 1;
            while (++j < 20) {
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                    if (stopFlag) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("\nThread Interrupted !");
        }
    }

    synchronized void suspendThread() {
        suspendFlag = true;
    }

    synchronized void resumeThread() {
        suspendFlag = false;
        notify();
    }

    synchronized void stopThread() {
        suspendFlag = false;
        stopFlag = true;
        notify();
    }
}

public class ThreadSRS {
    public static void main(String args[]) {
        try {
            SusResStop thread1 = new SusResStop("SRS");
            System.out.println("Thread SRST is created & started");
            Thread.sleep(2000);
            thread1.suspendThread();
            System.out.println("Thread SRST is suspended");
            Thread.sleep(2000);
            thread1.resumeThread();
            System.out.println("Thread SRST is resumed");
            Thread.sleep(2000);
            thread1.suspendThread();
            System.out.println("Thread SRST is suspended");
            Thread.sleep(2000);
            thread1.resumeThread();
            System.out.println("Thread SRST is resumed");
            Thread.sleep(2000);
            System.out.println("Thread SRST is stopped");
        } catch (InterruptedException e) {
            System.out.println("Generated interrupted exception");
        }
    }
}
