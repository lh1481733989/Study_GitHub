package CodeDemo08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream extends InputStream
 * ObjectInputStream 对象的反序列化流  把文件中存储的对象以流的方式读取出来使用
 *
 * 构造方法:
 *      ObjectInputStream(InputStream in)创建从指定 InputStream 读取的 ObjectInputStream。
 *      参数:
 *          InputStream in 字节输入流
 * 特有的成员方法:
 *       Object readObject()从 ObjectInputStream 读取对象。
 *
 * 使用步骤:
 *      1.创建ObjectInputStream对象，构造方法中传递字节输入流
 *      2.使用ObjectInputStream对象方法readObject读取保存对象的文件
 *      3.释放资源
 *      4.使用读取出来的对象(打印)
 *
 *      readObject()方法声明抛出了ClassNotFoundException异常  class文件找不到异常
 *      当不存在对象的class文件时抛出此异常
 *      反序列化的前提:
 *            1.类必须实现Serializable接口
 *            2.对象的对应class文件必须存在
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("a.txt"));
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(object);
    }
}
