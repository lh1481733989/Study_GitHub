package CodeDemo01;

/**
 * 自定义异常类：
 *      java提供的异常类，不够使用，需要自己定义一些异常类
 * 格式：
 *      public class XXXException extends Exception |  RuntimeException{
 *          1.无参的构造方法
 *          2.带异常信息的构造方法
 *      }
 * 注意：
 *      1.定义异常类一般以Exception结尾，声明它是一个异常类
 *      2.定义异常类必须继承Exception or RuntimeExcepiton
 *             extends Exception 表明 是一个编译期异常，如有异常，必须处理，需要throws或者try...catch
 *             extends RuntimeException 表明 是一个运行时异常，无需处理，交由jvm处理(打印，中断)
 */
public class XXXExceptionTest extends Exception{
    //1.无参的构造方法
    public XXXExceptionTest(){
        super();
    }
    //2.带异常信息的构造方法 查看源码发现，都会有一个带异常信息的构造方法，方法内部会调用父类带异常信息的构造方法，让父类处理异常
    public XXXExceptionTest(String string){
        super(string);
    }
}
