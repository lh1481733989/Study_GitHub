package CodeDemo06;

public class BaoziPu extends Thread{
    /*用构造方法获取包子对象*/
    private Baozi baozi;

    public BaoziPu(Baozi baozi){
        this.baozi = baozi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (baozi){
                /*如果有包子 调用wait方法进入等待*/
                if(baozi.isFlag()==true){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                /*被执行唤醒之后 包子铺执行生产包子*/
                if(count%2==0){
                    baozi.setPi("薄皮");
                    baozi.setXian("韭菜猪肉");
                }else {
                    baozi.setPi("冰皮");
                    baozi.setXian("牛肉蔬菜");
                }

                System.out.println("包子铺正在生产"+baozi.getPi()+baozi.getXian()+"的包子");
                count++;

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baozi.setFlag(true);
                System.out.println("包子铺生产好了"+baozi.getPi()+baozi.getXian()+"的包子");

                baozi.notify();
            }
        }
    }
}
