package CodeDemo02;

import java.util.Calendar;

/**
 * java.util.Calendar日历类
 * Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法
 * Calendar 无法直接创建对象，但内有一个静态方法叫getInstance();该方法返回了Canlendar类的子类对象
 * static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//多态
        System.out.println(calendar);

    }
}
