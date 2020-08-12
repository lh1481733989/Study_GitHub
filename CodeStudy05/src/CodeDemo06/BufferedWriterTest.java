package CodeDemo06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * java.io.BufferedWriter extends Writer
 * BufferedWriter字符缓冲输出流
 *
 * 有继承自父类的成员方法:write(),close(),flush()
 *
 * 构造方法:
 *      BufferedWriter(Writer out)创建一个使用默认大小输出缓冲区的缓冲字符输出流。
 *      BufferedWriter(Writer out, int sz)创建一个使用给定大小输出缓冲区的新缓冲字符输出流。
 *      参数:
 *          Writer out：字节输出流
 *              我们可以传递FileWrite,缓冲流会给FileWrite增加一个缓冲区，提高FileWrite的写入效率
 *          int sz ：指定缓冲流内部缓冲区的大小，不指定为默认
 *
 * 特定的成员方法:
 *      void newLine()写入一个行分隔符。
 *
 * 使用步骤:
 *      1.创建字符缓冲输出流对象，构造方法中传递字符输出流
 *      2.调用字符缓冲输出流中的方法，write，吧数据写入到内存缓冲区中
 *      3.调用字符缓冲流中的方法flush，吧内存缓冲区中的数据，刷新到文件
 *      4.释放资源
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));
        for (int i = 0; i < 5; i++) {
            bufferedWriter.write("林"+i);
            /*bufferedWriter.write("\r\n");*/
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
