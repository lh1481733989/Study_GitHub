package CodeDemo02;

public class Runnable2Test implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("helloworld  ----》"+i);
        }
    }
}
