package CodeDemo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.test.DateFormat
 * 是日期/时间格式化子类的抽象类
 * 允许进行格式化（也就是日期 -> 文本）、解析（文本-> 日期）和标准化
 * 成员方法
 *      String format(Date date)  按照指定的模式 将一个 Date 格式化为日期/时间字符串。
 *      Date parse(String source) 把符合模式的字符串，解析为日期
 * DateFormat为抽象类，无法直接 new对象，用其子类创建对象使用
 *
 * 构造方法：
 *      SimpleDateFormat(String pattern)
 *          用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
 *      参数：
 *          String pattern 指定的模式
 *      模式：区分大小写的
 *          y- M- d- H- m- s 写对应的模式，会转换成对应的日期
 *      注意：
 *          模式中的字母，不可更改，连接符号可以更改
 */
public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    /**
     * Date parse(String source) 把符合模式的字符串，解析为日期
     * 使用步骤：
     *      1.创建SimpleDateFormat对象，构造方法中传递指定的模式；
     *      2.调用SimpleDateFormat对象中的方法parse,按照构造方法中指定的模式，把字符串转换为date
     * 注意：
     *      parse方法申明了一个异常，叫ParseException 如果字符串和构造方法模式不一样，则抛出异常
     *      调用一个抛出了异常的方法，就必须处理这个异常，要么throws继续抛出这个异常，要么try catch自己处理
     *
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = simpleDateFormat.parse("2020年07月15日 09时50分12秒");
        System.out.println(date);
    }

    /**
     * 将日期转换成文本
     * 使用步骤：
     *      1.创建SimpleDateFormat对象，构造方法中传递指定的模式；
     *      2.调用SimpleDateFormat对象中的方法format,按照构造方法中指定的模式，把date转换为字符串
     */
    private static void demo01() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String dateStr= simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(dateStr);
    }
}
