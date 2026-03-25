package thread.poolExecutor;

import java.util.concurrent.*;

/**
 * ThreadPoolExecutor Demo
 */
public class PoolExecutorMain {
    public static void main(String[] args) {

        // ============================================
        // Create ThreadPoolExecutor
        // ============================================

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,                      // corePoolSize (minimum threads)
                4,                      // maximumPoolSize (max threads)
                10,                     // keepAliveTime
                TimeUnit.SECONDS,       // time unit
                new LinkedBlockingQueue<>() // queue for waiting tasks
        );

        // ============================================
        // Submit Tasks
        // ============================================

        for (int i = 1; i <= 6; i++) {
            executor.execute(new Task(i));
        }

        // ============================================
        // Shutdown Executor
        // ============================================

        executor.shutdown(); // stop accepting new tasks

        System.out.println("Main thread finished submitting tasks");
    }
}
