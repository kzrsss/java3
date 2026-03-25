package thread.producerConsumer;

/**
 * Shared Resource Class
 * ----------------------
 * This is the core of Producer-Consumer problem.
 * It uses:
 * - synchronized
 * - wait()
 * - notify()
 */
public class SharedResource {

    private int data;          // Shared data
    private boolean hasData = false; // Flag to track availability

    /**
     * Producer method
     * Adds data to the shared resource
     */
    public synchronized void produce(int value) {

        // If data already exists, wait until it's consumed
        while (hasData) {
            try {
                wait(); // release lock and wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Produce data
        data = value;
        hasData = true;

        System.out.println("Produced: " + data);

        // Notify waiting consumer
        notify();
    }

    /**
     * Consumer method
     * Takes data from the shared resource
     */
    public synchronized void consume() {

        // If no data, wait until producer produces
        while (!hasData) {
            try {
                wait(); // release lock and wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Consume data
        System.out.println("Consumed: " + data);

        hasData = false;

        // Notify waiting producer
        notify();
    }
}