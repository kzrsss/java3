package thread.producerConsumer;

/**
 * Producer Thread
 * ----------------
 * Produces data and sends it to SharedResource
 */
public class Producer extends Thread {

    private SharedResource resource;

    // Constructor to receive shared resource
    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {

        // Produce 5 values
        for (int i = 1; i <= 5; i++) {

            // Call produce method
            resource.produce(i);

            // Small delay (just for better output readability)
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}