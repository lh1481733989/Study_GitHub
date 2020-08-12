package CodeDemo07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.InputStreamReader extends Reader
 * InputStreamReader 是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符。(解码 把看不懂的转换为看得懂的)
 *
 * 继承了父类Reader中的成员方法:read(),close()
 *
 * 构造方法:
 *      InputStreamReader(InputStream in)创建一个使用默认字符集的 InputStreamReader。
 *      InputStreamReader(InputStream in, String charsetName)创建使用指定字符集的 InputStreamReader。
 *      参数:
 *          InputStream in 字节输入流,可以用来读取文件中保存的字节
 *          String charsetName自定的编码表名称,不区分大小写,可以是utf-8也可以是UTF-8... 不指定默认使用utf-8
 *
 * 使用步骤:
 *      1.创建一个InputstreamReader对象，构造方法中传递源文件的路径和指定编码
 *      2.使用InputstreamReader对象的read方法，读取文件
 *      3.释放资源
 *
 * 注意事项:
 *      构造方法中的编码表名称必须和文件相同，否则会发生乱码
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException{
        read_GBK();
    }

    private static void read_GBK() throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("a.txt"),"GBK");
        /*InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("a.txt"));*///省略则为utf-8 不符合文件编码���
        int len = 0;
        while( (len=inputStreamReader.read())!=-1){
            System.out.print((char) len);
        }
        inputStreamReader.close();
    }
}
