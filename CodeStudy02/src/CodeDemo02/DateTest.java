package CodeDemo02;

import java.util.Date;

/**
 * java.util.Date表示日期时间的类
 * 类Date表示特定的瞬间，精确到毫秒
 * 毫秒：千分之一秒  1000毫秒 = 1秒
 * 特定的瞬间：一个时间点，一刹那的时间
 *
 * 作用：可以对时间和日期进行计算
 * 2088-01-03 到2088-01-01中间一共多少天  可以用日期转换成毫秒计算，计算完毕，再把毫秒转换为日期
 *
 * 把日期转换成毫秒
 * 当前时间：2088-01-01  时间原点：1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点（英国格林尼治时间）
 * 就是计算当前日期到时间原点之间一共经历了多少毫秒
 * 注意：
 *      中国属于东八区，会把时间增加8个小时
 *
 * 把毫秒转换成日期
 * 1 天 = 24 × 60 × 60 = 86400 秒 =86400*1000 = 96400000 毫秒
 */
public class DateTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取系统当前时间 系统时间到原点时间共多少毫秒
        damo01();
        damo02();
        demo03();
    }

    /**
     * gettime(); 相当于System.currentTimeMillis() 获取系统当前时间 系统时间到原点时间共多少毫秒
     * 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

    }

    /**
     * DATE类的带参数构造方法
     * Date(long date):传递毫秒值，把毫秒值变为Date日期
     */
    private static void damo02() {
        Date date = new Date(0L);
        System.out.println(date);
    }

    /**
     * DATE类的空构造方法
     * Date() 获取当前系统时间
     */
    private static void damo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
