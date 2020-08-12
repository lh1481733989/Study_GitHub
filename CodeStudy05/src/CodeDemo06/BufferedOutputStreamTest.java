package CodeDemo06;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.BufferedOutputStream extends OutputStream
 * BufferedOutputStream:字节缓冲输出流
 *
 * 继承自父类的共性的成员方法：write flush close 等方法
 * 构造方法:
 *      BufferedOutputStream(OutputStream out)创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *      BufferedOutputStream(OutputStream out, int size)创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流。
 *      参数:
 *          OutputStream out:字节输出流
 *           我们可以传递FileOutputStream,缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率
 *
 *          int size ：指定缓冲流内部缓冲区的大小，不指定为默认
 *
 * 使用步骤：
 *      1.创建一个FileOutputStream对象，构造方法中绑定要输出的目的地
 *      2.创建一个BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream的效率
 *      3.使用BufferedOutputStream对象的write方法，把数据写入到缓冲区中，
 *      4.使用BufferedOutputStream对象的flush方法，把内部缓冲区的数据给刷新到文件中
 *      5.释放资源(会先调用flush刷新数据)
 */
public class BufferedOutputStreamTest {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("我把数据写入到缓冲区中".getBytes());
        bos.flush();
        bos.close();
    }
}
