package thread.threadJoin;

/**
 * Join Demo
 * ----------
 * Demonstrates how join() works in Java threads
 */
public class JoinMain {

    public static void main(String[] args) {

        // Create two threads using Runnable
        Thread t1 = new Thread(new ThreadJoin(), "Thread one:");
        Thread t2 = new Thread(new ThreadJoin(), "Thread two:");

        // Start both threads
        t1.start();
        t2.start();

        try {
            // ============================================
            // join() Example
            // ============================================

            // Main thread will WAIT until t2 finishes
            t2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // This line runs AFTER t2 is finished
        System.out.println("Main thread resumes after t2 finishes");
    }
}