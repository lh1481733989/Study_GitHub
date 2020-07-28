package CodeDemo06;

public class Test {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();//包子对象

        Thread thread1 = new Cussumer(baozi);
        Thread thread2 = new BaoziPu(baozi);
        thread1.start();
        thread2.start();
    }
}
