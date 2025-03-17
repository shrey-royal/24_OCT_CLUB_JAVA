class MyTask extends Thread {
    public MyTask() {
        super();
    }

    public MyTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running task " + i);
        }
    }
}

public class CreateThreads {
    public static void main(String[] args) {
        // Thread t1 = new Thread("rick");   // Thread-0
        // Thread t2 = new Thread("morty");   // Thread-1

        // t1.start();
        // t2.start();

        // System.out.println(t1.getName());
        // System.out.println(t2.getName());
        // ----------------------------------------------------------

        // Custom Thread (creating 2 thread like 2 different workers)
        MyTask task1 = new MyTask("rick");
        MyTask task2 = new MyTask("morty");

        // start both threads at the same time
        task1.start();
        task2.start();

    }
}
