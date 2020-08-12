package CodeDemo08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * java.io.ObjectOutputStream extends OutputStream
 * ObjectOutputStream:序列化流:把对象以流的方式写入到文件中保存
 *
 * 构造方法:
 *      ObjectOutputStream(OutputStream out)创建写入指定 OutputStream 的 ObjectOutputStream。
 *      参数：
 *          OutputStream out 字节输出流
 *
 * 特有的成员方法:
 *      void writeObject(Object obj)将指定的对象写入 ObjectOutputStream。
 *
 * 使用步骤:
 *      1.创建一个 ObjectOutputStream对象，构造方法中传递字节输出流
 *      2.使用 ObjectOutputStream对象的writeObject方法，把对象写入到文件中
 *      3.释放资源
 *
 * NotSerializableException
 * 序列化和反序列化的时候，会抛出NotSerializableException异常没有序列化异常
 * 类通过实现java.io.Serializable接口以启用其序列化功能，未实现此接口的类将无法使用其任何状态的序列化和反序列化
 * Serializable接口也叫标记性接口:
 *      要进行序列化和反序列化的类必须实现Serializable接口，就会给类添加一个标记
 *      当我们进行序列化的时候，就会检测是否有这个标记
 *          有: 可进行序列化和反序列化
 *          无: 抛出NotSerializableException异常
 * eg:去市场卖肉 --> 有检疫标记章 --> 可放心购买
 *
 * static关键字:静态关键字
 *      静态优先于非静态加载到内存中(静态优先于对象加载到内存中)
 *      被static修饰的成员不能被序列化，序列化的都是对象
 *
 * transient关键字:瞬态关键字
 *      被trancient修饰的成员变量，不能被序列化
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("a.txt"));
        objectOutputStream.writeObject(new Person("张三",18));
        objectOutputStream.close();
    }
}
