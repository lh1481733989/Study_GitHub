package CodeDemo02;

/**
 * 匿名内部类实现线程的创建
 *
 * 匿名：没有名字
 * 内部类：写在其他类内部的类
 * 匿名内部类的作用：简化代码
 *      把子类继承父类，重写父类的方法，创建子类对象合成一步完成
 *      把实现类实现接口，重写接口中的方法，创建实现类对象合成一步完成
 * 匿名内部类的最终产物：子类/实现类对象，而这个类/实现类对象没有名字
 *
 * 格式：new 父类/接口(){
 *     重写父类/接口中的方法
 * }
 *
 */
public class ThreadCreat03Test {
    public static void main(String[] args) {
        //线程的父类是Thread
        /*new Thread().start();*/
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"---》"+i);
                }
            }
        }.start();

        /*接口实现类的方式*/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"---》"+i);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        /*简化接口实现类*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"---》"+i);
                }
            }
        }).start();

    }
}
