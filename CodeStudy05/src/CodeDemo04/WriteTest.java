package CodeDemo04;

import java.io.FileWriter;
import java.io.IOException;

/**
 * java.io.Writer:字符输出流,是所有字符输出流的最顶层的父类，是一个抽象类
 *
 * 公共的成员方法:
 *           void write(int c)写入单个字符。
 *           void write(char[] cbuf)写入字符数组。
 *           abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分。
 *           void write(String str)写入字符串。
 *           void write(String str, int off, int len)写入字符串的某一部分。
 *           abstract  void flush()刷新该流的缓冲。
 *           abstract  void close()关闭此流，但要先刷新它。
 *
 * java.io.FileWriter extends OutputStreamWriter extends Writer
 * FileWriter:文件字符输出流
 * 作用:把内存中的字符写入到文件中
 *
 * 构造方法:
 *     FileWriter(String fileName)根据给定的文件名构造一个 FileWriter 对象。
 *     FileWriter(File file)根据给定的 File 对象构造一个 FileWriter 对象。
 *     参数:写入数据的目的地
 *          String fileName  文件路径
 *          File file        文件对象
 *      FileWrite构造方法的作用:
 *          1.创建一个FileWrite对象
 *          2.根据构造方法的路径/文件，创建文件
 *          2.把FileWrite对象指向创建好的文件
 * 字符输出流的使用步骤:
 *      1.创建FileWrite对象，构造方法中绑定要写入的数据的目的地
 *      2.使用FileWrite对象中的方法write把数据写入到内存缓冲区中(字符转换成字节的过程)
 *      3.使用FileWrite对象的方法flush,把内存缓冲区中的数据，刷新到文件中
 *      4.释放资源(先把内存缓冲区中的数据刷新到文件中)
 *
 *
 */
public class WriteTest {
    public static void main(String[] args) throws IOException{
        show01();
        System.out.println("----------");
        show02();
        System.out.println("----------");
        show03();
    }

    /**
     * 追加写/续写
     * FileWriter(File file, boolean append)根据给定的 File 对象构造一个 FileWriter 对象。
     * FileWriter(String fileName, boolean append)根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
     *
     * 换行:
     *      windows: \r\n
     *      linux:   \n
     *      mac:     \r
     * @throws IOException 路径不存在异常
     */
    private static void show03() throws IOException{
        FileWriter fileWriter = new FileWriter("a.txt",true);
        fileWriter.write("\r\n");
        fileWriter.write("船只");
        /*fileWriter.write("陈沉成",1,2);*/
        fileWriter.flush();

        fileWriter.close();
    }

    private static void show02() throws IOException{
        FileWriter fileWriter = new FileWriter("a.txt");
        char[] chars = {'1','2','3','4'};
        int len = 0;
        /*fileWriter.write(chars,1,3);*/
        /*fileWriter.write(chars);*/
        /*fileWriter.write("船只");*/
        fileWriter.write("陈沉成",1,2);
        fileWriter.flush();

        fileWriter.close();
    }

    /**
     * flush和close方法的区别
     *      --flush刷新缓冲区，流对象可以继续使用
     *      --close先刷新缓冲区，流对象释放，流对象不可使用
     * @throws IOException 路径不存在异常
     */
    private static void show01() throws IOException{
        FileWriter fileWriter = new FileWriter("a.txt");

        fileWriter.write(97);
        fileWriter.flush();/*刷新数据过去  可不写*/
        fileWriter.write(98);/*刷新缓冲区，流对象可以继续使用*/
        fileWriter.flush();

        fileWriter.close();
    }
}
