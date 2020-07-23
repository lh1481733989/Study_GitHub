package CodeDemo01;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Throws关键字：异常处理的第一种方式，交给别人处理
 * 作用：
 *      当方法内部抛出异常对象的时候，我们就必须处理这个异常对象
 *      可以使用throws关键字处理异常对象，会把异常的对象申明抛出给方法的调用者处理(自己不处理，让别人处理),最终交给jvm处理(打印，中断)
 * 使用格式：在方法声明时使用
 *      修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException...{
 *          throw new AAAException("产生异常的原因");
 *          throw new BBBException("产生异常的原因");
 *          ...
 *      }
 * 注意事项：
 *      1.throws关键字必须写在方法的声明处
 *      2.throws关键字后边声明的异常必须是exception或者是exception的子类
 *      3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
 *          如果抛出多个异常对象有子父类关系，那么直接声明父类异常即可
 *      4.调用了一个声明抛出异常的方法，我们就必须处理声明的异常
 *          要么继续使用throws声明抛出，给方法的调用者处理，最终给jvm
 *          要么try catch自己处理了
 */
public class ThrowsTest {
    /**
     *
     * @param args
     * @throws IOException 如果抛出异常有父子关系，那么直接声明父类异常即可 FileNotFoundException exnteds IOException
     * (IOException extends Exception 所以也可以直接写Exception)
     */
    public static void main(String[] args) throws /*FileNotFoundException,*//*IOException*/Exception {
        readFile("c:\\2.tt");
        System.out.println("后续代码");
    }
    /**
     * 定义一个查看路径的方法
     * 如果路径不是c:\\1.txt，则告知方法的调用者，抛出路径找不到
     * 注意:
     *      FileNotFoundException为编译异常，必须处理
     *      可以使用throws继续声明抛出的FileNotFoundException这个异常对象，要方法的调用者处理
     */
    public static void readFile(String fileName) throws /*FileNotFoundException,*/IOException {
        if(!fileName.equals("c:\\2.tt")){
            throw new FileNotFoundException("路径没找到");
        }
        System.out.println("路径找到了；");
        /**
         * 判断文件后缀是否以.txt结尾
         * 不是抛出IO异常IOException 文件结尾不正确
         */
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件结尾不正确");
        }
    }
}
