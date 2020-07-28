package CodeDemo05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 卖票案例出现了线程安全问题，卖出了不存在的票和重复的票
 *
 * 解决线程安全的第三种方案：使用lock锁
 * java.util.conrrent.locks.Lock接口
 * Lock实现提供了比使用synchronized方法和语句可获得的更广泛的锁定操作。
 * Lock接口中的方法：
 *      void lock()获取锁。
 *      void unlock()释放锁。
 * java.util.concurrent.locks.ReentrantLock implements  Lock接口
 *
 * 使用步骤：
 *      1.在成员位置创建一个ReentrantLock对象
 *      2.在可能出现线程安全的代码前调用lock接口中的lock方法获取锁
 *      3.在可能出现线程安全的代码后调用lock接口中的unlock方法释放锁
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        /*让卖票动作持续进行*/
        while (true){
            lock.lock();
            /*访问共享数据的代码块*/
                /*判断票是否存在*/
                if(ticket>0){
                    /*用睡眠提高程序出错的几率*/
                    try {
                        Thread.sleep(10);
                        /*对象卖票*/
                        System.out.println(Thread.currentThread().getName()+"卖出---->"+ticket);
                        ticket--;

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
        }
    }
}
