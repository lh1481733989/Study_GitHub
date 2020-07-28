package CodeDemo07;

/**
 * 面向对象编程思想：
 *      做一件事情，找一个能够解决这件事情的对象，调用对象的方法，完成事情
 * 函数式编程思想：
 *      只要能获取到结果，谁去做的，怎么做的不重要，重视的是结果，不是过程
 *
 * Lambda表达式的标准格式：
 *      由三部分组成:
 *          a.一些参数
 *          b.一个箭头
 *          c.一段代码
 *      格式：
 *          (参数列表)->{一些重写方法的代码};
 *      解释说明格式：
 *          ():接口中抽象方法的参数列表，没有参数就空着，有参数就写出参数，多个参数用,分割
 *          ->:传递的意思，把参数传递给方法体{}
 *          {}:重写接口的抽象方法的方法体
 *
 * Rambda使用前提：
 *      1.使用Rambda必须有接口，且要求接口中有且只有一个抽象方法
 *      2.使用Rambda必须具有上下文推断
 *
 * Rambda表达式:可推导，可以省略
 * 凡是根据上下文推导出来的内容，都可以省略书写
 * 可以省略的内容：
 *      1.(参数列表):括号中的参数列表的数据类型，可以省略不写
 *      2.(参数列表):括号中的参数如果只有一个，那么类型和()都可以省略
 *      3.{一些代码}:如果{}中的代码只有一行，无论是否具有返回值，都可以省略( {} return ; )
 *          注意：要省略就( {} return ; )三个一起省略
 */
public class RambdaTest {
    public static void main(String[] args) {
        /*①使用接口实现类方式创建多线程*/
        Thread thread1 = new RunnableImpl();
        thread1.start();

        /*②使用匿名内部类*/
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建了线程");
            }
        };
        new Thread(runnable).start();
        /*③使用匿名内部类简化版*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建了线程");
            }
        }).start();

        /*使用rambda表达式*/
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"创建了线程");
        }).start();

        /*rambda表达式的简化版本*/
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"创建了线程")).start();
    }
}
