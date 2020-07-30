package CodeDemo01;

import java.io.File;

/**
 * java.io.File类
 * 文件和目录路径名的抽象表示形式
 * java把电脑中文件和文件夹(目录)封装为了一个file类，我们可以使用file类对文件和文件夹进行操作
 * 我们可以使用file类的方法
 *      创建文件/文件夹
 *      删除文件/文件夹
 *      获取文件/文件夹
 *      判断文件/文件夹是否存在
 *      对文件夹进行遍历
 *      获取文件的大小
 * File类是一个与系统无关的类，任何操作系统都可以使用这个类中的方法
 *
 * 重点：记住这三个单词
 *      file 文件
 *      directory 文件夹/目录
 *      path 路径
 * 路径：
 *      绝对路径：是一条完整的路径
 *          以盘符开始的全路径名
 *           G:\\github\\Study_GitHub\\CodeStudy05
 *      相对路径：是一条简化的路径
 *          相对指的是以当前项目的相对
 *          例如：G:\\github\\Study_GitHub\\CodeStudy05\\1.txt ---> 1.txt 系统会默认从该项目的路径下寻找
 *      注意：
 *          1.路径不区分大小写
 *          2.路径中的文件名称分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个正常的反斜杠
 *
 */
public class IoFileTest {
    public static void main(String[] args) {
        /*File类的静态方法*/
        show01();
        System.out.println("============");
        /*File类的构造方法*/
        show02();
        /*File类的构造方法2*/
        show03("c:\\","1.txt");
        /*File类的构造方法3*/
        show04();
    }

    /**
     * File(File parent, String child)根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
     * 把路径分成了两部分
     *      File parent：父路径
     *      String child：子路径
     * 好处：
     *      父路径和子路径可以单独写，使用起来非常灵活，父路径和子路径都可以变化
     *      父路径是File类型，可以使用File类的方法对路径进行一些操作，再使用路径创建对象
     */
    private static void show04() {
        File file = new File("C:\\");
        File file1 = new File(file,"a.java");
        System.out.println(file1);
    }

    /**
     * File(String parent, String child)根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
     * 把路径分成了两部分
     *      String parent：父路径
     *      String child：子路径
     * 好处：父路径和子路径可以单独写，使用起来非常灵活，父路径和子路径都可以变化
     */
    private static void show03(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /**
     *  File(String pathname)通过将给定的路径名称字符串转换为一个新的File实例
     *  参数：
     *  String pathname:字符串的路径名称
     *  路径可以是文件结尾，也可以是文件夹结尾
     *  路径可以是相对路径，也可以是绝对路径
     *  路径可以不存在，也可以存在
     *  创建File对象，只是把字符串封装成File对象，不考虑路径的真假情况
     */
    private static void show02() {
        File file1 = new File("G:\\github\\Study_GitHub\\CodeStudy05\\a.txt");
        System.out.println(file1);//重写了toString 方法，打印了路径

        File file2 = new File("G:\\github\\Study_GitHub\\CodeStudy05");
        System.out.println(file2);//重写了toString 方法，打印了路径

        File file3 = new File("a.txt");
        System.out.println(file3);//重写了toString 方法，打印了路径
    }

    /**
     * static String pathSeparator    与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
     * static char pathSeparatorChar  与系统有关的路径分隔符。
     * static String separator        与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
     * static char separatorChar      与系统有关的默认名称分隔符。
     */
    private static void show01() {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//获取系统有关的路径分隔符  window: ;  linux: :
        String separator = File.separator;
        System.out.println(separator);   //获取与系统有关的默认名称分隔符  windos: \  linux: /
    }
}
