package CodeDemo07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * FileReader可以读取IDEA默认编码(UTF-8)格式的文件
 * FileReader读取系统默认编码(GBK)会产生乱码
 *
 * java.io.OutputStreamWriter extends Writer
 * OutputStreamWriter:是字符流通向字节流的桥梁：可使用指定的 charset 将要写入流中的字符编码成字节 (编码:把能看懂的变为看不懂的)
 *
 * 继承自父类的成员方法：writer(),close(),flush()
 *
 * 构造方法:
 *      OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter。
 *      OutputStreamWriter(OutputStream out, String charsetName)创建使用指定字符集的 OutputStreamWriter。
 *      参数:
 *          OutputStream out字节输出流,可以用来写转换之后的字节到文件中
 *          String charsetName自定的编码表名称,不区分大小写,可以是utf-8也可以是UTF-8... 不指定默认使用utf-8
 *
 * 使用步骤:
 *      1.创建一个OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称
 *      2.使用OutputStreamWriter对象方法writer，把字符转换成字节存储到缓冲区中(编码)
 *      3.使用OutputStreamWriter方法flush，把内存缓冲区的字节刷新到文件中(使用字节流写字节的过程)
 *      4.释放资源
 *
 *
 *
 */
public class OutputStreamWriteTest {
    public static void main(String[] args) throws IOException{
        write_utf_8();
    }

    private static void write_utf_8() throws IOException{
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"), "GBK");//GBK
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));//默认为utf-8*/
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}