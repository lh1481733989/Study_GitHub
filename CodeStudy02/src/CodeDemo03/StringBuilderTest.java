package CodeDemo03;

/**
 * java.long.StringBuilder类 字符串缓冲区，可以提高字符串的效率
 * 构造方法：
 *      StringBuilder()
 *          构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
 *      StringBuilder(String str)
 *          构造一个字符串生成器，并初始化为指定的字符串内容。
 *
 * 常用方法：
 *      StringBuilder append(obj b) 将任何数据类型参数的字符串表示形式追加到序列。
 *      StringBuilder和string可以相互转换：
 *          StringBuilder->string  可以使用StringBuilder的构造方法
 *              StringBuilder(String str)  构造一个字符串生成器，并初始化为指定的字符串内容。
 *          string->StringBuilder  可以使用StringBuilder中的toString方法
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        //空构造方法
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("strB:"+stringBuilder);

        StringBuilder stringBuilder1 = new StringBuilder("abc");
        System.out.println("strB:"+stringBuilder1);
        System.out.println("==================");
        method();
        System.out.println("==================");

        //调用toString方法
        String toStr = stringBuilder1.toString();
        System.out.println(toStr);
    }

    /**
     * 使用append方法往stringBuilder中添加数据
     */
    private static void method() {
        StringBuilder stringBuilder = new StringBuilder();
        //append方法返回值是this，调用方法的对象stringBuilder，this=stringBuilder
        System.out.println("StrBui:"+stringBuilder);
        StringBuilder strBur = stringBuilder.append("abc");//把stringBuilder地址复制给strBur
        System.out.println("StrBui2:"+strBur);
        System.out.println(strBur==stringBuilder);//比较的是地址
        System.out.println("===================");
        //使用append方法无需接收返回值
        /**
         * 链式编程：方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase());
        strBur.append('a').append(9).append(9.8);
        System.out.println(strBur);
    }
}
