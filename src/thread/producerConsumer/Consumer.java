package thread.producerConsumer;

/**
 * Consumer Thread
 * ----------------
 * Consumes data from SharedResource
 */
public class Consumer extends Thread {

    private SharedResource resource;

    // Constructor to receive shared resource
    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {

        // Consume 5 times
        for (int i = 1; i <= 5; i++) {

            // Call consume method
            resource.consume();

            // Small delay (just for better output readability)
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}