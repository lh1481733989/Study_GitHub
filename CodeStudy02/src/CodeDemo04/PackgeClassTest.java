package CodeDemo04;

/**
 * 装箱：把基本类型的数据，包装到包装类中（基本数据->包装类）
 *      构造方法：
 *          Integer(int value)构造一个新分配的 Integer 对象，它表示指定的 int 值。
 *          Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
 *                             传递的字符串必须是基本类型的字符串，否则会抛出异常“100”
 *      静态方法
 *          static Integer valueOf(int i)返回一个表示指定的 int 值的 Integer 实例。
 *          static Integer valueOf(String s)返回保存指定的 String 的值的 Integer 对象。
 * 拆箱：在包装类中取出基本类型的数据
 *      成员方法：
 *      int intValue()  以 int 类型返回该 Integer 的值。
 *
 */

public class PackgeClassTest {
    public static void main(String[] args) {
        //装箱 构造方法
        Integer integer1 = new Integer(1);
        System.out.println(integer1);

        Integer integer2 = new Integer("1");
        System.out.println(integer2);

        //静态方法
        Integer integer3 = Integer.valueOf(1);
        System.out.println(integer3);

//        Integer integer4 = Integer.valueOf("a"); //NumberFormatException 数据格式转换异常
        Integer integer4 = Integer.valueOf("1");
        System.out.println(integer4);
        System.out.println("======================");

        //拆箱
        int i = integer1.intValue();
        System.out.println(i);
    }
}
