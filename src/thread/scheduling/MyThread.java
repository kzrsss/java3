package thread.scheduling;

/**
 * Custom Thread class
 * -------------------
 * This class demonstrates:
 * - Creating a thread by extending Thread
 * - Using yield() and sleep()
 */
public class MyThread extends Thread {

    /**
     * Constructor to set thread name
     * @param name Thread name
     */
    public MyThread(String name) {
        super(name); // Pass name to Thread class
    }

    /**
     * run() method contains the code that will be executed
     * when the thread starts
     */
    @Override
    public void run() {

        // Loop 5 times to simulate some work
        for (int i = 1; i <= 5; i++) {

            // Print current thread name and iteration number
            System.out.println(
                    Thread.currentThread().getName() + " is running: " + i
            );

            // ============================================
            // Yield Example
            // ============================================
            // Suggests the scheduler to give other threads a chance
            // NOTE: This is just a hint, not guaranteed
            Thread.yield();

            // ============================================
            // Sleep Example
            // ============================================
            // Pause the current thread for 500 milliseconds
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

                // If thread is interrupted while sleeping
                System.out.println(
                        Thread.currentThread().getName() + " was interrupted"
                );
            }
        }

        // Indicate thread finished execution
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}