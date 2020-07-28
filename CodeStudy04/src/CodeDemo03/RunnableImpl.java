package CodeDemo03;

/**
 * 卖票案例出现了线程安全问题，卖出了不存在的票和重复的票
 *
 * 解决线程安全的第一种方案：使用同步代码块
 * 格式
 *      synchronized(锁对象){
 *          可能会出现线程安全问题的代码(访问了共享数据的代码)
 *      }
 * 注意：
 *      1.通过代码块中的所对象，可以使用任意对象
 *      2.但是必须保证多个线程使用的锁对象是同一个
 *      3.锁对象的作用
 *           把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;

    Object object = new Object();
    @Override
    public void run() {
        /*让卖票动作持续进行*/
        while (true){
            /*访问共享数据的代码块*/
            synchronized(object){
                /*判断票是否存在*/
                if(ticket>0){
                    /*用睡眠提高程序出错的几率*/
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    /*对象卖票*/
                    System.out.println(Thread.currentThread().getName()+"卖出---->"+ticket);
                    ticket--;
                }
            }
        }
    }
}
