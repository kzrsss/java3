package thread.syncronized;

public class MySynchronized implements Runnable {
    @Override
    public void run() {
        this.printNumber();
        this.printDnumbers();
    }

    // that method synchronized
    public synchronized void printNumber(){
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // that method not synchronized - mixed up
    public void printDnumbers(){
        for (int i = 10; i > 1; i--) {
            System.out.println(Thread.currentThread().getName() + " d" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
