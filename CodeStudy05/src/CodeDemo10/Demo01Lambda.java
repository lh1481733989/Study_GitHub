package CodeDemo10;

/**
 * Lambda优化日志
 * lambda特点，延迟加载
 * lambda使用前提，必须存在函数式接口
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用showlogger方法传递日志级别和信息
        showLog(1, ()->{
            return msg1+msg2+msg3;
        });
        /*使用lambda表达式作为参数传递，仅仅是把参数传递到showLog方法中
          只有满足条件，日志等级是1级
            才会调用接口MessageBudder中的builderMessage()方法
            才会进行字符串的拼接
          如果不满足条件，日志的等级不是1级
            那么接口MessageBudder中的builderMessage()方法也不会执行
            所以拼接字符串的代码也不会执行
          不会存在性能浪费
        */

    }

    public static void showLog(int level,Demo01LambdaIter iter){
        //对日志等级进行判断，如果是1 调用拼接方法
        if(level==1){
            iter.builderMessage();
        }
    }
}
