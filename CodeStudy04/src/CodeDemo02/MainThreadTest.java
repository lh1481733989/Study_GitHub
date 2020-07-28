package CodeDemo02;

/**
 * 主线程:执行主(main)方法的线程
 *
 * 单线程的程序：java程序中只有一个线程
 * 执行从main方法开始，从上到下依次执行
 */
public class MainThreadTest {
    public static void main(String[] args) {
        Person person1 = new Person("小青");
        person1.run();
        Person person2 = new Person("小黑");
        person2.run();
    }
}
