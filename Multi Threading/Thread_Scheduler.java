class MyThread extends Thread {
    public MyThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running - Count " + i);
            try {
                Thread.sleep(1000); //Simuling some work by sleeping for a short time
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        }
    }
}

public class Thread_Scheduler {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);    // 1
        t2.setPriority(Thread.NORM_PRIORITY);   // 5
        t3.setPriority(Thread.MAX_PRIORITY);    // 10

        t1.start();
        t2.start();
        t3.start();

        // wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished execution.");

    }
}
