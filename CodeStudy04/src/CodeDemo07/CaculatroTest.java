package CodeDemo07;

public class CaculatroTest {
    public static void main(String[] args) {
        /*匿名内部类*/
        invokeCaculator(1, 2, new Caculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        });
        System.out.println("=========================");

        /*Rambda表达式*/
        invokeCaculator(2,4,(int a,int b)->{
            return a+b;
        });
    }
    public static void invokeCaculator(int a,int b,Caculator caculator){
        int sum = caculator.sum(a,b);
        System.out.println(sum);
    }
}
