

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + " is in RUNNING state.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class LifeCycle {
    public static void main(String[] args) {
        System.out.println("Main thread is in RUNNING state.");

        // Creating a new thread (initial state: NEW)
        MyThread t = new MyThread();
        System.out.println("Thread 1 created: " + t.getState());
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(t.getName());

        // Start a thread (Thread moves to RUNNABLE state)
        t.start();
        System.out.println("Thread 1 started: " + t.getState());

        try {
            // Main thread waits for the 't' thread to finish execution
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // After t finishes, we check the state again
        System.out.println("Thread 1 state after completion: " + t.getState()); // Thread is in TERMINATED state
    }
}

/*
Comments:

-> Explanation of the Thread Life Cycle:

1. NEW (Born State):
   - A thread is in the NEW state when it is created but has not yet started running. In the program, this is the state of the thread 't' before calling 'start()'.

2. RUNNABLE (Ready to Run):
   - Once the 'start()' method is invoked, the thread moves to the RUNNABLE state. The thread is eligible for running, but it may not be immediately running because of the operating system's thread scheduler. In the program, this is shown after calling 't.start()'.

3. RUNNING (Executing):
   - When the thread starts executing the code inside the 'run()' method, it enters the RUNNING state. In the example, the thread runs for 2 seconds (simulated using 'Thread.sleep(2000)').

4. WAITING or BLOCKED (Not Running):
   - A thread can enter the WAITING state if it calls 'sleep()', 'join()', or is waiting for another thread to notify it (using 'wait()', 'notify()'). In our program, the 't' thread enters the WAITING state because of the 'sleep(2000)' method.

5. TERMINATED (Dead):
   - Once the thread finishes executing the 'run()' method, it moves to the TERMINATED state. This is the state of the thread when its execution is complete.

-> The states are represented as:
1. NEW: A thread has been created but not yet started.
2. RUNNABLE: The thread is ready to execute or is currently executing (the thread scheduler decides when the thread actually runs).
3. BLOCKED: A thread is blocked and waiting to acquire a lock or resource.
4. WAITING: A thread is waiting for some other thread to perform a specific action (e.g., 'join()' or 'sleep()').
5. TIMED_WAITING: A specific kind of waiting where the thread is waiting for a specific amount of time (e.g., 'sleep(time)').
6. TERMINATED: The thread has finished its execution.

-> Output of the program:

Main thread is in RUNNING state.
Thread 1 created: NEW
Thread 1 started: RUNNABLE
1 is in RUNNING state.
Thread 1 state after completion: TERMINATED


*/