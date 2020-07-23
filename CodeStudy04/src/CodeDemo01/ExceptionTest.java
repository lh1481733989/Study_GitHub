package CodeDemo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.long.Throwable 类是java语言中所有错误或异常的超类
 *      Exception：编译器异常，进行编译（写代码）时期java程序出现的异常
 *         RuntimeException:运行期异常，java程序运行期间出现的问题
 *         异常就相当于程序得了小毛病，把异常处理掉，程序可以继续执行
 *      Error：错误
 *         错误相当于程序得了无法治愈的问题(癌症),必须修改代码,程序才能继续执行
 */
public class ExceptionTest {
    public static void main(String[] args) /*throws ParseException*/ {
        /*//Exception
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse("1999-11-11");//把字符串日期转换成Date格式日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/

        // RuntimeException:运行期异常
        /*int[] arr = {2,32,3};
        //System.out.println(arr[0]);
        try{
            //可能出现异常的代码块
            System.out.println(arr[3]);
        }catch (Exception e){
            //处理异常的逻辑
            System.out.println(e);
        }*/

        /*error 错误
        * OutOfMemoryError 内存溢出的错误，创建的数组太大了，超出了给jvm分配的内存
        * */
        int[] arr = new int[1024*1024/**1024*/];
        //必须修改代码

        System.out.println("后续代码");
    }
}
