package CodeDemo01;

import java.io.File;

/**
 * File类获取功能的方法
 * String getAbsolutePath()返回此抽象路径名的绝对路径名字符串。
 * String getPath()将此抽象路径名转换为一个路径名字符串。
 * String getName()返回由此抽象路径名表示的文件或目录的名称。
 * long length()返回由此抽象路径名表示的文件的长度。
 */
public class IoGetFileTest {
    public static void main(String[] args) {
        show01();
        System.out.println("=============");
        show02();
        System.out.println("=============");
        show03();
        System.out.println("=============");
        show04();
    }

    /**
     * long length()返回由此抽象路径名表示的文件的长度。
     * 获取的是构造方法的文件大小，以字节为单位
     * 注意：
     *      文件夹是没有大小概念的，不能获取文件夹大小,返回0
     *      如果构造方法中给出的路径不存在 那么.lenght方法返回0
     */
    private static void show04() {
        File file = new File("C:\\Users\\admin\\Desktop\\无标题.png");
        long length = file.length();
        System.out.println(length);

        File file2 = new File("C:\\Users\\admin\\Desktop\\无标题1.png");
        long length2 = file2.length();
        System.out.println(length2);

        File file3 = new File("C:\\Users\\admin\\Desktop");
        long length3 = file3.length();
        System.out.println(length3);
    }

    /**
     * String getName()返回由此抽象路径名表示的文件或目录的名称。
     * 获取的就是构造方法传递的结尾部分(文件/文件夹)
     */
    private static void show03() {
        File file = new File("G:\\github\\Study_GitHub\\a.txt");
        String name = file.getName();
        System.out.println(name);

        File file2 = new File("G:\\github\\Study_GitHub");
        String name2 = file2.getName();
        System.out.println(name2);
    }

    /**
     * String getPath()将此抽象路径名转换为一个路径名字符串。
     *
     * toString方法调用的就是getPath方法
     */
    private static void show02() {
        File file = new File("G:\\github\\Study_GitHub\\a.txt");
        String filePath = file.getPath();
        System.out.println(filePath);

        File file1 = new File("a.txt");
        String getPath = file1.getPath();
        System.out.println(getPath);
        System.out.println(file1.toString());/*调用的就是getPath方法*/
    }

    /**
     * String getAbsolutePath()返回此抽象路径名的绝对路径名字符串。
     * 获取构造方法中传递的路径
     * 无论路径是绝对的还是相对的，getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01() {
        File file = new File("G:\\github\\Study_GitHub\\a.txt");
        String filePath = file.getAbsolutePath();
        System.out.println(filePath);

        File file1 = new File("a.txt");
        String absolutePath = file1.getAbsolutePath();
        System.out.println(absolutePath);
    }
}
