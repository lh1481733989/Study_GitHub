package CodeDemo06;

public class Cussumer extends Thread{
    private Baozi baozi;

    public Cussumer(Baozi baozi){
        this.baozi = baozi;
    }
    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if(baozi.isFlag()==false){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("消费者正在吃"+baozi.getPi()+baozi.getXian()+"的包子");
                baozi.setFlag(false);
                baozi.notify();
                System.out.println("消费者吃完了，唤醒包子铺生产"+baozi.getPi()+baozi.getXian()+"的包子");
                System.out.println("------------------------------------");

            }
        }
    }
}
