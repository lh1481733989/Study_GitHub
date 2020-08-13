package CodeDemo10;

/**
 * Lambda表达式实现Runnbale实现类
 */
public class Demo02Runnable {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"---》线程启动了");
            }
        });

        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"---》线程启动了");
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"---》线程启动了"));
    }
    //定义一个startThread方法，方法的参数使用函数式接口Runnable
    public static void startThread(Runnable runnable){
        new Thread(runnable).start();
    }
}
