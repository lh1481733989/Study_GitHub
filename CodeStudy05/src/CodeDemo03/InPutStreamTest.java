package CodeDemo03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * java.io.InputStream 字节输入流
 *  此抽象类是表示字节输入流的所有类的超类
 *
 *  定义了所有子类共享的方法：
 *      abstract  int read()从输入流中读取数据的下一个字节。
 *      int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 *       void close()关闭此输入流并释放与该流关联的所有系统资源。
 *
 * java.io.FileInputStream extends InputStream
 * FileInputStream:文件输入流
 * 作用:
 *      把硬盘文件中的数据，读取到内存中使用
 * 构造方法：
 *      FileInputStream(String name)
 *      FileInputStream(File file)
 *      参数:读取文件的数据源
 *          String name:文件的路径
 *          File file:文件
 *      构造方法的作用:
 *          1.创建一个FileInputStream对象
 *          2.把FileInputStream对象指定构造方法中要读取的文件
 * 读取数据的原理(硬盘-->内存):
 *      java程序-->JVM-->OS-->OS读取数据的方法-->读取文件
 *
 * 字节输入流的使用步骤(重点):
 *      1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 *      2.使用FileInputStream对象中的read，读取文件
 *      3.释放资源
 */
public class InPutStreamTest {
    public static void main(String[] args) throws IOException{
        show01();
        System.out.println("---------------------");
        show02();

    }
    /**
     * 一次读取多个
     *      int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
     * 明确两件事
     *      1.方法的参数byte[]的作用?
     *          起到缓冲作用，存储每次读取到的多个字节
     *          数组的长度一般定义为1024(1KB)或者1024的整数倍
     *      2.方法的返回值int是什么
     *          每次读取的有效字节数
     *
     * String类的构造方法
     *      String(byte[] bytes):把字节数组转换成字符串
     * @throws IOException 空读异常
     */
    private static void show02() throws IOException{
        FileInputStream fis = new FileInputStream("c.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        /*System.out.println(read);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));*/
        while ((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
    /**
     * 一次读取一个
     * @throws IOException IO空异常
     */
    private static void show01() throws IOException{
        FileInputStream fileInputStream = new FileInputStream("c.txt");
        int read = 0;//读取文件中的一个字节并返回，读取到文件的末尾返回-1
        /*(read = fileInputStream.read())!=-1
          1.fileInputStream.read()获取输入流返回值
          2.将返回值给read
          3.判断read是否== -1
        */
        while ( (read = fileInputStream.read())!=-1){
            System.out.print(read);
        }
        fileInputStream.close();
    }
}
