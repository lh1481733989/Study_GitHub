package CodeDemo07;

public class RunnableImpl extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了线程");
    }
}
