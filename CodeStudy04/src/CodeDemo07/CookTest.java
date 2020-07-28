package CodeDemo07;

public class CookTest {
    public static void main(String[] args) {
        /*使用匿名内部类方式*/
        inVokeCook(new Cook() {
            @Override
            public void makFood() {
                System.out.println("吃饭了");
            }
        });
        System.out.println("===================");
        inVokeCook(()->{
            System.out.println("Rambda吃饭了");
        });
    }
    public static void inVokeCook(Cook cook){
        cook.makFood();
    }
}
