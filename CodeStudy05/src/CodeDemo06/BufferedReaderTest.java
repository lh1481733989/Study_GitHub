package CodeDemo06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * java.io.BufferedReader extends Reader
 * BufferedReader字符缓冲输入流
 *
 * 继承了父类的共性的成员方法:read(),close()
 *
 * 构造方法:
 *      BufferedReader(Reader in)创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 *      BufferedReader(Reader in, int sz)创建一个使用指定大小输入缓冲区的缓冲字符输入流。
 *      参数:
 *          Writer out：字节输入流
 *              我们可以传递FileReader,缓冲流会给FileReader增加一个缓冲区，提高FileWrite的读取效率
 *          int sz ：指定缓冲流内部缓冲区的大小，不指定为默认
 *
 * 特有的成员方法:
 *      String readLine()读取一个文本行。读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。
 *      返回值:
 *           包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
 *
 * 使用步骤:
 *      1.创建字符缓冲输入流对象，构造方法中传递字符输入流
 *      2.调用字符缓冲输入流中的方法，reader/readerLine，吧数读取到内存缓冲区中
 *      3.释放资源
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        /*String line = bufferedReader.readLine();
        System.out.println(line);*/
        String line;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
