package CodeDemo04;

/**
 * 可变参数：jdk1.5后新特性
 * 使用前提：
 *         当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
 * 使用格式：定义方法时使用
 *          修饰符 返回值类型  方法名(数据类型...变量名){
 *
 *          }
 * 可变参数的原理：底层就是一个数组，根据传递参数的个数不同，会创建不同长度的数组，来存储这些参数，传递参数的个数，可以是(0~N)
 *
 * 注意事项：
 *         1.如参数有多个，则可变参数放置末尾
 *         2.一个方法的参数列表，只能有一个可变参数
 *         public static void Test(int i , String s ,double a ,int...in){
 *
 *         }
 * JDK源码中的“终极”写法
 *         public static void Test(Object...obj){
 *
 *         }
 */
public class VarArgsTest {
    public static void main(String[] args) {
        sumTwo(1,2);
        sumThree(1,2,3);
        int i = sumN(1,2,3,4,5);
        System.out.println(i);
    }

    /**
     * 计算0~N的和
     */
    private static int sumN(int...num) {
        int sum = 0 ;
        for (int i : num) {
            sum+=i;
        }
        return sum;
    }
    /**
     * 计算两个数的和
     */
    private static int sumTwo(int i , int s) {
        return i+s;
    }
    /**
     * 计算三个数的和
     */
    private static int sumThree(int i , int s , int c) {
        return i+s+c;
    }

}
