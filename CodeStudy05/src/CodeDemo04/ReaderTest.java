package CodeDemo04;

import java.io.FileReader;
import java.io.IOException;

/**
 * java.io.Reader:字符输入流,是字符输入流最顶层的父类，定义了一些共性的成员方法,是一个抽象类
 * 性的成员方法：
 *      int read()读取单个字符。
 *      int read(char[] cbuf)一次读取多个字符将字符读入数组。
 *      void close()关闭该流并释放与之关联的所有资源。
 *
 * java.io.FileReader extends InputStreamReader extends Reader
 * FileReader:文件字符输入流
 * 作用:把硬盘文件中的数据以字符的方式读取到内存中
 * 构造方法:
 *      FileReader(String fileName)在给定从中读取数据的文件名的情况下创建一个新 FileReader。
 *      FileReader(File file)在给定从中读取数据的 File 的情况下创建一个新 FileReader。
 *      参数；读取文件的数据源
 *          String fileName  文件路径
 *          File file        文件对象
 *      FileReader构造方法的作用:
 *          1.创建一个FileReader对象
 *          2.把FileReader对象指向要读取的文件
 * 字符输入流的使用步骤:
 *      1.创建FileReader对象，构造方法中绑定要读取的数据源
 *      2.使用FileReader对象中的方法read读取文件
 *      3.close流
 *
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException{
        show01();
    }

    private static void show01() throws IOException{
        FileReader fileReader = new FileReader("c.txt");
        /*int len = 0;
        while ((len =fileReader.read())!=-1){
            System.out.print((char) len);
        }*/
        char[] chars = new char[1024];
        int len=0;
        while ((len = fileReader.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        fileReader.close();
    }
}
