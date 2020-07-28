package CodeDemo02;

/**
 * 获取线程的名称:
 *      1.获取Thread类中的getName()
 *          String getName()返回该线程的名称
 *      2.获取当前正在执行的线程，再使用线程的getName()方法
 *          Static Thread currentThread() 返回当前正在执行的线程对象的引用
 */
public class MyThread extends Thread {
    public MyThread(){

    }
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        /*for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }*/

        /*Thread thread = new Thread();
        System.out.println(thread.getName());*/

        System.out.println("run:"+Thread.currentThread().getName());
    }
}
