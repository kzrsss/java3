package thread.basic;

// Runnable = Only defines the TASK (job), not the thread itself
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable running in: "
                + Thread.currentThread().getName());
    }
}
