class A implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("From Thread A, i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class B implements Runnable {
    public void run() {
        for (int j = 0; j <= 5; j++) {
            System.out.println("From Thread B, j = " + j);
        }
        System.out.println("Exit from B");
    }
}

class C implements Runnable {
    public void run() {
        for (int k = 0; k <= 5; k++) {
            System.out.println("From Thread C, k = " + k);
        }
        System.out.println("Exit from C");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        Thread t3 = new Thread(new C());
        t1.start();
        t2.start();
        t3.start();
    }
}
