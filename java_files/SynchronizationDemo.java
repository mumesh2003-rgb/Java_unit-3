class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class SyncThread extends Thread {
    static Counter c = new Counter();

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        SyncThread t1 = new SyncThread();
        SyncThread t2 = new SyncThread();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + SyncThread.c.count);
    }
}
