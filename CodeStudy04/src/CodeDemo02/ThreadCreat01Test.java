package CodeDemo02;

/**
 * 创建多线程程序的第一种方式：创建Thread类的子类
 * java.long.Thread类:是描述线程的类，我们要实现多线的程序，就必须继承Thread类
 *
 * 实现步骤:
 *      1.创建要给Thread类的子类
 *      2.在Thread类的子类中重写Thread类中的run方法，设置线程任务(开启线程要做什么)
 *      3.创建Thread类的子类对象
 *      4.调用Thread类中的方法,start方法 开启新的线程，执行run方法
 *       void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
 *       结果是两个线程并发地运行；当前线程（mian线程）和另一个线程（创建的新线程执行其 run 方法）。
 *       多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
 * java程序属于抢占式调度，哪个线程的优先级高，哪个线程优先执行，同一个优先级，随机选择一个执行
 *
 * 获取线程的名称:
 *      1.获取Thread类中的getName()
 *          String getName()返回该线程的名称
 *      2.获取当前正在执行的线程，再使用线程的getName()方法
 *          Static Thread currentThread() 返回当前正在执行的线程对象的引用
 *
 * 设置线程的名称:
 *      1.使用Thread类中的方法setName(名字)
 *          void setName(String name) 改变线程名称，使之与参数相同
 *      2.创建一个带参的构造方法，参数传递线程的名字，调用父类的构造方法，把线程的名称转给父类，让父类给子线程起名字
 *          Thread(String name) 分配新的Thread对象
 *
 * public static void sleep(long millis) :使当前正在执行的线程以指定的毫秒数暂停(暂时停止执行)
 * 毫秒数结束后，线程继续执行
 *
 *
 */
public class ThreadCreat01Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("线程1");
        myThread.start();
        /*for (int i = 0; i < 20; i++) {
            System.out.println("main"+i);
        }*/
        System.out.println("============");

        new MyThread("线程2").start();
        /*链式编程*/
        System.out.println("main："+Thread.currentThread().getName());

        System.out.println("============");
        for (int i = 1; i <= 60 ; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
