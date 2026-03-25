package thread.scheduling;

/**
 * Thread Scheduling Demo
 * -----------------------
 * This class demonstrates:
 * - Creating multiple threads
 * - Setting thread priorities
 * - Running threads concurrently
 */
public class ThreadSchedulingDemo {

    public static void main(String[] args) {

        // ============================================
        // Create Threads
        // ============================================

        // Create two thread objects with names
        MyThread t1 = new MyThread("Thread - 1");
        MyThread t2 = new MyThread("Thread - 2");

        // ============================================
        // Set Thread Priorities
        // ============================================

        // Minimum priority (1) → Less chance to run
        t1.setPriority(Thread.MIN_PRIORITY);

        // Maximum priority (10) → More chance to run
        t2.setPriority(Thread.MAX_PRIORITY);

        // NOTE:
        // Priority is NOT guaranteed — OS scheduler decides execution order

        // ============================================
        // Start Threads
        // ============================================

        // start() creates a new thread and calls run()
        t1.start();
        t2.start();

        // ============================================
        // Main Thread Execution
        // ============================================

        // This runs in the main thread (separate from t1 & t2)
        System.out.println("Main thread finished");

        // NOTE:
        // Output order may change because threads run concurrently
    }
}