package CodeDemo02;

/**
 * 递归：方法自己调用自己(套娃)
 *      递归的分类：
 *             分两种：直接递归和间接递归
 *             直接递归：方法自己调用自己
 *             间接递归：A调用B方法，B方法调用C方法，C方法调用A方法
 *
 *       注意事项：
 *              递归中一定要有条件，保证递归能够停下来，否则会导致栈内存溢出
 *              虽有条件限制，但是递归的次数不能太多，否则也会导致栈内存溢出
 *              构造方法，禁止递归
 * 递归的使用前提：
 *      当调用方法的时候，方法的主体不变，每次调用方法的参数不同，可以使用递归
 *
 *
 */
public class DiGui {
    public static void main(String[] args) {
        /*a();*/
        b(1);
    }
    /**
     * 构造方法，禁止递归
     * 编译报错 构造方法是创建对象的，一次构造会一直创建对象
     */
    /*public DiGui{
        DiGui;
    }*/

    /**
     * 虽有条件限制，但是递归的次数不能太多，否则也会导致栈内存溢出
     * Exception in thread "main" java.lang.StackOverflowError
     */
    private static void b(int i) {
        System.out.println(i);
        if(i==10000){
            return;
        }
        b(++i);
    }

    /**
     * 递归中一定要有条件，保证递归能够停下来，否则会导致栈内存溢出
     * Exception in thread "main" java.lang.StackOverflowError
     */
    private static void a() {
        System.out.println("a方法！");
        a();
    }
}
