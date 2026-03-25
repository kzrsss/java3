package thread.producerConsumer;

/**
 * Wait / Notify Demo (Producer-Consumer)
 * --------------------------------------
 * This example shows how threads communicate with each other
 * using synchronized, wait(), notify(), and notifyAll().
 */
public class WaitNotifyDemo {

    public static void main(String[] args) {

        // Shared object between threads
        SharedResource resource = new SharedResource();

        // Create Producer and Consumer threads
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        // Start threads (they run concurrently)
        producer.start();
        consumer.start();

        // ============================================
        // 🔑 KEY CONCEPTS (IMPORTANT FOR BEGINNERS)
        // ============================================

        /*
         * 1. synchronized
         * ----------------
         * - Used to control access to a shared resource.
         * - Only ONE thread can enter a synchronized method/block at a time.
         * - Prevents data inconsistency (race condition).
         *
         * Example:
         * public synchronized void produce() { ... }
         */

        /*
         * 2. wait()
         * ----------
         * - Makes the current thread WAIT (pause execution).
         * - It releases the lock so another thread can enter.
         * - Used when a condition is NOT satisfied.
         *
         * Example:
         * while (!hasData) {
         *     wait(); // Consumer waits until data is available
         * }
         */

        /*
         * 3. notify()
         * ------------
         * - Wakes up ONE waiting thread.
         * - Used after changing the shared state.
         *
         * Example:
         * notify(); // Wake up either producer or consumer
         */

        /*
         * 4. notifyAll()
         * ----------------
         * - Wakes up ALL waiting threads.
         * - Safer when multiple threads are waiting.
         *
         * Example:
         * notifyAll();
         *
         * Difference:
         * notify()    → wakes ONE thread
         * notifyAll() → wakes ALL threads
         */

        /*
         * 🔁 How they work together:
         * --------------------------
         * Producer:
         *   - If buffer is full → wait()
         *   - After producing → notify()
         *
         * Consumer:
         *   - If buffer is empty → wait()
         *   - After consuming → notify()
         */

        /*
         * ⚠️ IMPORTANT RULES:
         * -------------------
         * - wait(), notify(), notifyAll() MUST be used inside synchronized
         * - Always use while loop (NOT if) to check condition
         */
    }
}