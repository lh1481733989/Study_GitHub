package CodeDemo06;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * java.io.BufferedInputStream extends InputStream
 * BufferedInputStream 字节缓冲输入流
 *
 * 继承自父类的成员方法:read() close()方法
 *
 * 构造方法:
 *      BufferedInputStream(InputStream in)创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *      BufferedInputStream(InputStream in, int size)创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *      参数:
 *          InputStream in：字节输入流
 *              我们可以传递FileInputStream,缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的读取效率
 *          int size ：指定缓冲流内部缓冲区的大小，不指定为默认
 *
 * 使用步骤:
 *      1.创建一个FileInputStream对象，构造方法中绑定要读取的数据源
 *      2.创建一个BufferedInputStream对象，构造方法中传入FileInputStream对象提高读取效率
 *      3.使用BufferedInputStream对象的read方法读取文件
 *      4.释放资源
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;//记录每次读取的有效字节数
        /*while ((len = bis.read())!=-1){
           System.out.println(len);
        }*/
        byte[] bytes = new byte[1024];
        while( (len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
