package CodeDemo03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * java.io.OutputStream :字节输出流
 * 此抽象类是表示输出字节流的所有类的超类
 *
 * 定义了一些子类共性的成员方法：
 *  void close()关闭此输出流并释放与此流有关的所有系统资源。
 *  void flush()刷新此输出流并强制写出所有缓冲的输出字节。
 *  void write(byte[] b)将 b.length 个字节从指定的 byte 数组写入此输出流。
 *  void write(byte[] b, int off, int len)将指定 byte 数组中写入len字节，从偏移off开始输出到此输出流
 *  abstract  void write(int b)将指定的字节写入此输出流。
 *
 * java.io.FileOutputStream extends OutputStream
 *      FileOutputStream: 文件字节输出流
 *      作用：把内存中的数据写入到硬盘的文件中
 *
 *      构造方法：
 *          FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流。
 *          FileOutputStream(File file)   创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *          参数:写入数据的目的地
 *              String name 目的地是一个文件的路径
 *              File file   目的地是一个文件
 *          构造方法的作用:
 *              1.创建一个FileOutputStream对象
 *              2.会根据构造方法中传递的文件,文件路径,创建一个空的路径
 *              3.会把FileOutputStream对象指向创建好的文件
 * 写入数据的原理(内存-->硬盘)
 *      java程序-->JVM(java虚拟机)-->os(操作系统)-->os调用写数据的方法-->把数据写入到文件中
 *
 * 字节输出流的使用步骤(重点):
 *      1.创建一个OutputStream对象，构造方法中传递写入数据的目的地
 *      2.调用FileOutputstream对象方法write，把数据写入到文件中
 *      3.释放资源(流使用会占用一定的内存，使用完要清空内存，提供程序效率)
 */
public class OutPutStreamTest {
    public static void main(String[] args) throws IOException{
        show01();
        System.out.println("===============");
        show02();
    }

    /**
     * 一次写多个字节（记事本中写入100）
     * @throws IOException io异常
     */
    private static void show02() throws IOException{
        FileOutputStream fos = new FileOutputStream(new File("G:\\github\\Study_GitHub\\CodeStudy05\\src\\CodeDemo03\\b.txt"));
        /*
        多次写入一个字节
         */
        fos.write(49);
        fos.write(49);
        fos.write(48);
        /*
        void write(byte[] b)将 b.length 个字节从指定的 byte 数组写入此输出流。
        一次写入多个字节:
            如果写入的第一个字节为正数(0-127),那么显示的时候会查询ASCII码表
            如果写入的第一个字节为负数，那么第一个字节和第二个字节会组成一个中文显示，查询的是Os默认码表(GBK)
         */
        byte[] bytes = {65,66,67,68,69};
        fos.write(bytes);
        /*
        void write(byte[] b, int off, int len)：把字节数组的一部分写入到文件中
              int off 数组的开始索引
              int len 写几个字节
         */
        fos.write(bytes,1,2);

        /*
        写入字符串的方法，可以使用string类中的方法，把字符串转换为字符数组
            String.getBytes()方法
         */
        byte[] bytes1 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);
        /*
        释放资源
         */
        fos.close();
    }

    /**
     * 一次写一个字节
     * @throws IOException io异常
     */
    private static void show01() throws IOException{
        //1.创建一个OutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("G:\\github\\Study_GitHub\\CodeStudy05\\src\\CodeDemo03\\a.txt");
        //2.调用FileOutputstream对象方法write，把数据写入到文件中
        //abstract  void write(int b)将指定的字节写入此输出流。
        fos.write(97);
        fos.close();
    }

}
