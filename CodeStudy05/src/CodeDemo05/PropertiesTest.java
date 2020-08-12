package CodeDemo05;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * java.util.Properties extends Hashtable<K,V> implements Map<K,V>
 * Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
 * Properties集合是唯一一个和IO流结合的集合
 *      可以使用Properties集合中的方法store,把集合中的数据持久化到硬盘
 *      可以使用Properties集合中的load方法，把硬盘中保存的数据读取到集合中使用
 *
 * 属性列表中每个键及其对应值都是一个字符串。
 *      Properties是一个双列集合，key和value默认的泛型是String
 *
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException{
        show01();
        System.out.println("--------");
        show02();
        System.out.println("--------");
        show03();
    }

    /**
     * 可以使用Properties集合中的load方法，把硬盘中保存的数据读取到集合中使用
     *  void load(InputStream inStream) 字节输入流 不能读取含有中文的键值对
     *  void load(Reader reader)  字符输入流  可以读取中文的键值对
     *  使用步骤：
     *      1.创建Properties集合对象
     *      2.使用Properties集合对象中的方法load读取保存在磁盘的键值对文件
     *      3.遍历Properties集合
     *  注意事项：
     *      1.存储键值对的文件中，键与值的默认链接符号可以使用=,空格(其他符号)
     *      2.存储键值对的文件中，可以使用#进行注释，被注释的键值对不会被读取
     *      3.存储键值对的文件中，键值默认都是字符串，不用再加引号
     */
    private static void show03() throws IOException{
        Properties prop = new Properties();
        prop.load(new FileReader("b.txt"));
        Set<String> stringsSet = prop.stringPropertyNames();
        for (String key : stringsSet) {
            String value = prop.getProperty(key);
            System.out.println("key:"+key+" value:"+value);
        }
    }

    /**
     * 可以使用Properties集合中的方法store,把集合中的数据持久化到硬盘
     * void store(OutputStream out, String comments)
     * void store(Writer writer, String comments)
     * 参数:
     *      OutputStream:字节输出流，不能写中文
     *      Writer:字符输出流，可写中文
     *      comments:用来解释说明保存文件用于什么
     *              不能使用中文，会产生乱码，默认unicode编码
     *              一般使用""空字符串
     *
     * 使用步骤：
     *      1.创建Properties集合对象，添加数据
     *      2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
     *      3.使用Properties集合中的方法store把集合中的数据持久化到硬盘
     *      4.释放资源
     */
    private static void show02() throws IOException{
        //创建Properties对
        Properties prop = new Properties();
        //使用setProperties方法
        prop.setProperty("张三","南");
        prop.setProperty("李四","北");
        prop.setProperty("王二","东");
        //流对象
        FileWriter fw = new FileWriter("b.txt");
        //写入
        prop.store(fw,"save date");

        fw.close();
    }

    /**
     * 使用Properties集合存储数据，遍历取出Properties集合中的数据
     * Properties有一些操作字符串的特有方法
     *      Object setProperty(String key, String value)调用 Hashtable 的方法 put。
     *      String getProperty(String key)用指定的键在此属性列表中搜索属性。通过key找value,相当于Map集合中get方法
     *      Set<String> stringPropertyNames()返回此属性列表中的键集，其中该键及其对应值是字符串，相当于Map集合中Keyset方法
     */
    private static void show01() {
        //创建Properties对象
        Properties properties = new Properties();
        //使用setProperties方法
        properties.setProperty("张三","南");
        properties.setProperty("李四","北");
        properties.setProperty("王二","东");

        //使用StringinPropertiesNames把Properties集合中的键取出存储在set集合中
        Set<String> stringSet = properties.stringPropertyNames();

        //遍历set集合
        for (String s : stringSet) {
            //使用getProperties获取值
            String property = properties.getProperty(s);
            System.out.println("key:"+s+" value:"+property);
        }
    }

}
