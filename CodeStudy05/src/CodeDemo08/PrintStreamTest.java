package CodeDemo08;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * java.io.PrintStream 打印流
 *      PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式
 * PrintStream特点:
 *      1.只负责数据的输出，不负责数据的读取
 *      2.与其他输出流不同，PrintStream 永远不会抛出 IOException
 *      3.有特有的方法print println
 * 构造方法:
 *      PrintStream(File file)输出的目的地是一个文件
 *      PrintStream(OutputStream out)输出的目的地是一个字节输出流
 *      PrintStream(String fileName)输出的目的地是一个文件的路径
 *
 * PrintStream extends OutputStream
 * 继承自父类的成员方法:write() flush() close()
 * 注意:
 *      1.如果要使用继承自父类的write方法，那么查看数据的时候会查询编码表 97 a
 *      2.如果使用特有的print/printlb方法，数据原样输出 97  97
 *
 * 可以改变输出语句的目的地(打印流的流向)
 *      输出语句 默认在控制台输出
 *      使用System.setOut 方法可以改变输出语句的目的地为参数传递的打印流的目的地
 *      static void setOut(PrintStream out)重新分配“标准”输出流。
 */
public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我在控制台输出");
        PrintStream printStream = new PrintStream("c.txt");
        /*printStream.write(97);*/
        /*printStream.println(97);*/
        System.setOut(printStream);
        System.out.println("我在打印流中输出");
        printStream.close();
    }
}
