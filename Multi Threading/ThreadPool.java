// class MyThread extends Thread {
//     public MyThread(String name) {
//         super(name);
//     }

//     @Override
//     public void run() {
//         System.out.println(Thread.currentThread().getName() + " is running!");
//         try {
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

// public class ThreadPool {
//     public static void main(String[] args) {
//         MyThread t[] = new MyThread[5];

//         for (int i = 0; i < t.length; i++) {
//             t[i] = new MyThread("t" + i);
//             t[i].start();
//             try {
//                 t[i].join();
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) message: " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + "(End)");
    }

    void processMessage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            Runnable worker = new WorkerThread("" + i);
            executorService.execute(worker);
        }
        executorService.shutdown();

        while(!executorService.isTerminated()) {}

        System.out.println("Finished all Threads");
    }
}