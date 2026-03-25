package thread.poolExecutor;

/**
 * Task Class
 */
public class Task implements Runnable{
    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {

        // Get current thread
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " is executing Task " + taskId);

        try {
            // Simulate work
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + " completed Task " + taskId);
    }
}
