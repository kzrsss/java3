package thread.syncronized;

public class SyncMain {
    public static void main(String[] args) {
        MySynchronized mt1 = new MySynchronized();
        MySynchronized mt2 = new MySynchronized();

        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);

        t1.setName("Timer one : ");
        t2.setName("Timer two : ");

        t1.start();
        t2.start();
    }
}
