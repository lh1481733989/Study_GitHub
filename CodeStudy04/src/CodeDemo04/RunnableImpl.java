package CodeDemo04;

/**
 * 卖票案例出现了线程安全问题，卖出了不存在的票和重复的票
 *
 * 解决线程安全的第一种方案：使用同步方法
 * 步骤：
 *      1.把访问了共享数据的代码抽取出来放入方法中
 *      2.在方法中添加一个synchronized关键字
 * 格式
 *      修饰符 synchronized 返回值类型 方法名(参数列表){
 *          可能会出现线程安全问题的代码(访问了共享数据的代码)
 *      }
 */
public class RunnableImpl implements Runnable {
    private static int ticket = 100;
    @Override
    public void run() {
        /*让卖票动作持续进行*/
        while (true){
            sayticked();
        }
    }

    /**
     * 静态的同步方法  其锁的对象是该类的class  的文件对象 RunnableImpl.class
     */
    public static synchronized void saytickedStatic(){
        /*访问共享数据的代码块*/
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
    /**
     *  定义一个同步方法  其锁的对象是实现类对象this  new RunnableImpl()
     */
    public synchronized void sayticked(){
        /*访问共享数据的代码块*/
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
