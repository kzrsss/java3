package thread.threadJoin;

public class ThreadJoin implements Runnable{
    @Override
    public void run() {
        Thread t =  Thread.currentThread();
        System.out.println(t.getName() + " start");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            throw new RuntimeException();
        }
        System.out.println(t.getName() + " end");
    }
}
