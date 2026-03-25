package thread.basic;

public class ThreadMain {
    public static void main(String[] args) {

        // ================================
        // Runnable Example
        // ================================

        // Step 1: Create Runnable task
        // This is just the JOB (what to do), NOT a thread
        MyRunnable runnableTask = new MyRunnable();

        // Step 2: Pass Runnable to Thread
        // Now we create an actual Thread
        Thread t1 = new Thread(runnableTask);

        // Step 3: Start the thread
        // This will run run() method in a NEW thread
        t1.start();

        // t1.run();
        // This runs like a normal method (NO new thread)


        // ================================
        // Thread Class Example
        // ================================

        // Step 1: Create object of class that extends Thread
        MyThreadClass t2 = new MyThreadClass();

        // Step 2: Start the thread
        // This creates a NEW thread and runs run()
        t2.start();

        // This prints the name of the main thread
        System.out.println("Main running in: "
                + Thread.currentThread().getName());
    }
}