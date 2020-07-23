package CodeDemo01;

import java.io.IOException;

/**
 * try...catch:异常处理中的第二种方式，自己处理异常
 * 格式：
 *      try{
 *          可能出现异常的代码块
 *      }catch(异常类名 异常变量){
 *          处理异常的逻辑,一般写入日志文件中
 *      }
 *      ...
 *      catch(){
 *
 *      }finally{
 *          无论是否出现异常都会执行
 *      }
 * 注意事项：
 *  1.try中可能抛出多个异常对象，用多个catch来处理多种异常
 *  2.如果try中产生了异常，则执行catch中的逻辑，执行完catch逻辑后，继续执行try...catch后的代码
 *      如果try中没有异常，则不执行catch中的逻辑，直接执行try...catch后的代码
 * finally注意事项：
 *  1.finally不能单独使用，必须和try一起使用
 *  2.finally一般用于资源释放，资源回收，不论程序是否出现异常，我们都要资源释放(io)
 *
 */
public class TryCatchTest {
    public static void main(String[] args){
        try{
            //可能出现异常的代码块
            readFile("a.txet");
           /* System.out.println("资源释放");*///无法执行到的
        }catch (IOException e){//try中抛出什么异常对象，catch中就定义什么异常变量用来接收异常对象
            /*System.out.println(e);*/
            /**
             * Throwable类的三个方法
             * String getMessage();返回简单信息
             * String toString();返回详细信息
             * void printStackTrace()  JVM打印异常对象默认调用此方法，打印的异常信息是最全面的
             */
            /*System.out.println(e.getMessage());*/ //文件结尾不正确
            /*System.out.println(e.toString()); */  //java.io.IOException: 文件结尾不正确 重写Object类toString方法= sout(e)
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }

        System.out.println("后续...");
    }
    /**
     * 定义一个查看路径的方法
     * 如果后缀不是txt，则告知方法的调用者，抛出文件结尾不正确
     */
    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件结尾不正确");
        }
        System.out.println("文件没问题");
    }
}
