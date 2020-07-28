package CodeDemo06;

/**
 * 等待唤醒案例(顾客买包子)：
 *      创建一个顾客线程(消费者):告知老板要的包子的种类和数量,调用wait方法，使线程进入waiting状态(无线等待)
 *      创建一个老板线程(生产者):花了5S做包子，做好后，调用notify方法告知顾客包子好了可以吃了
 *
 * 注意：
 *      顾客和老板必须用同步代码块包裹起来，保证等待和唤醒只有一个在执行
 *      同步使用的锁对象必须保证唯一
 *      只有锁对象才能调用wait和notify方法
 *
 *      Object类中的方法
 *      void wait()
 *              在其他线程里调用此对象notify()方法或notifyAll()方法前，导致当前线程等待
 *      void wait(long m)
 *              在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态(作用与sleep类似)
 *
 *      void notify()
 *              唤醒在此对象监视器上等待的单个线程
 *              会继续执行wait()方法后的代码
 *      void notifyAll()
 *              唤醒锁对象的所有线程
 */
public class WaitNotifyTest {
    public static void main(String[] args) {
        /*锁对象必须保证唯一*/
        Object object = new Object();
        /*顾客线程*/
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (object){
                        System.out.println("顾客1告知老板要的包子的种类和数量");

                        try {
                            object.wait();
                            /*object.wait(5000);*/
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客1顾客开始吃了");
                        System.out.println("-----------------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (object){
                        System.out.println("顾客2告知老板要的包子的种类和数量");

                        try {
                            object.wait();
                            /*object.wait(5000);*/
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客2顾客开始吃了");
                        System.out.println("-----------------------");
                    }
                }
            }
        }.start();

        /*老板线程*/
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (object){
                        System.out.println("老板包子做好了，唤醒顾客线程");
                        /*object.notify();*/
                        object.notifyAll();/*唤醒锁的所有对象*/
                    }
                }
            }
        }.start();
    }
}
