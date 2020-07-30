package CodeDemo01;

import java.io.File;
import java.io.IOException;

/**
 * boolean createNewFile()当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
 * boolean delete()删除此抽象路径名表示的文件或目录。
 * boolean mkdir()创建此抽象路径名指定的目录。
 * boolean mkdirs()创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
 *
 * 注意：
 *      操作文件/文件夹的时候看类型不看名称
 */
public class IoCreateDelTest {
    public static void main(String[] args) throws IOException{
        show01();
        System.out.println("==============");
        show02();
        System.out.println("==============");
        show03();
    }

    /**
     * boolean delete()删除此抽象路径名表示的文件或目录。
     * 此方法，可删除构造方法中的文件和文件夹
     * 返回值：
     *      true  文件/文件夹删除成功，返回true
     *      false 文件夹/文件有内容，不会删除，返回false;构造方法的路径不存在也返回false
     * 注意：
     *      delete方法是直接在硬盘删除文件/文件夹，不走回收站，删除要谨慎
     *
     */
    private static void show03() {
        File file1 = new File("C:\\Users\\admin\\Desktop\\aaa");
        File file2 = new File("C:\\Users\\admin\\Desktop\\aaa\\bbb");
        File file3 = new File("C:\\Users\\admin\\Desktop\\无标题2.txt");

        System.out.println(file1.delete());
        System.out.println(file2.delete());
        System.out.println(file3.delete());
    }

    /**
     * boolean mkdir()创建单级空文件夹
     * boolean mkdirs()创建多级空文件夹，也可以创建单级
     * 创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
     * 返回值：
     *      true  文件夹不存在，创建文件夹，返回true
     *      false 文件夹存在，不创建文件夹，返回false;构造方法给出的路径不存在也返回false
     * 注意：
     *      1.此方法只能创建文件夹，不能创建文件
     *      2.路径不存在，不抛异常，不创建文件夹
     *
     */
    private static void show02() {
        File file1 = new File("C:\\Users\\admin\\Desktop\\aaa");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);

        File file2 = new File("C:\\Users\\admin\\Desktop\\aaa\\bbb");
        boolean mkdirs = file2.mkdirs();
        System.out.println(mkdirs);
    }

    /**
     * boolean createNewFile() 构造方法路径位置不存在文件时，创建一个新的空文件
     * 创建文件的路径和名称在构造方法中给出(构造方法的参数)
     * 返回值：
     *      true  文件不存在，创建文件，返回true
     *      false 文件存在，不创建文件，返回false
     * 注意：
     *      1.此方法只能创建文件，不能创建文件夹
     *      2.创建文件的路径必须存在，否则会抛出异常
     *
     * public boolean createNewFile() throws IOException  声明抛出了IO异常 调用时，必须处理这个异常，要么throws 要么try catch
     */
    private static void show01() throws IOException{
        File file1 = new File("C:\\Users\\admin\\Desktop\\无标题2.txt");
        boolean newFile = file1.createNewFile();
        System.out.println(newFile);/*创建是否成功*/
    }
}
