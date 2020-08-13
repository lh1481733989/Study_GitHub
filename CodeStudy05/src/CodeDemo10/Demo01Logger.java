package CodeDemo10;

/**
 * 日志案例
 *
 * 发现以下代码存在一些性能浪费的问题
 * 调用showLog方法，传递的第二个参数是一个拼接后的字符串
 * 先把字符串拼接好，然后再调用showLog方法
 * showLog方法中如果传递的日志等级不是1  就不会输出拼接后的字符串 所以字符串白拼接了
 */
public class Demo01Logger {
    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用showlogger方法传递日志级别和信息
        showLog(2,msg1+msg2+msg3);
    }
    public static void showLog(int level,String message){
        //对日志等级进行判断，如果是1 输出日志信息
        if(level==1){
            System.out.println(message);
        }
    }
}
