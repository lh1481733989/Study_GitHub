package CodeDemo04;

import java.util.ArrayList;

/**
 * 自动装箱与装箱
 * jdk1.5后新特性
 * 基本数据类型与字符串之间的转换
 * 基本数据类型->字符串
 *          1.基本数据类型的值+"" 最简单的方法
 *          2.使用包装类的静态方法toString(参数),不是object类的toString方法，重载
 *            static String toString(int i)  返回一个表示指定整数的 String 对象。
 *          3.String类的静态方法，valueof(参数)
 *            static String valueOf(int i)   返回 int 参数的字符串表示形式。
 * 字符串->基本数据类型
 *          使用包装类的静态方法parseXXX(“数据类型的字符串”);
 *              Integer类  static int parseInt(String s )
 */
public class AutoPackgeClassTest {
    public static void main(String[] args) {
        //自动装箱
        Integer in = 1 ;//直接把int类型整数赋值给包装类Integer
        //自动拆箱 再自动装箱
        in = in + 2 ;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // 隐含了自动装箱
        int a = list.get(0); //自动拆箱
        System.out.println(a);
        System.out.println("======================");

        int  i1  = 100 ;
        String str1 = i1 + "";
        System.out.println(str1+200);

        String str2 = Integer.toString(100);
        System.out.println(str2+200);

        String str3 = String.valueOf(100);
        System.out.println(str3+200);


        int int1 = Integer.parseInt(str1);
        System.out.println(int1-10);

    }
}
