package thread.basic;

// Thread class = Thread + Task together
class MyThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("Thread class running in: "
                + Thread.currentThread().getName());
    }
}
