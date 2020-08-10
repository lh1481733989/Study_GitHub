package CodeDemo03;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 追加/续写:使用两个参数的构造方法
 *      FileOutputStream(String name, boolean append)创建一个向具有指定 name 的文件中写入数据的输出文件流。
 *      FileOutputStream(File file, boolean append)创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *      参数：
 *          String name、File file:写入数据的目的地
 *          boolean append:追加写的开关
 *              true:创建对象不会覆盖原文件，会继续在文件的末尾追加写数据
 *              false:创建一个新文件，覆盖原文件，在新文件中写数据
 * 写换行:写换行符号
 *      windows:/r/n
 *      linux:/n
 *      mac:/r
 */
public class OutPutStreamNextTest {
    public static void main(String[] args) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("c.txt",true);
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("你好".getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
