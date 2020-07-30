package CodeDemo01;

import java.io.File;

/**
 * boolean isDirectory()测试此抽象路径名表示的文件是否是一个目录。
 * boolean isFile()     测试此抽象路径名表示的文件是否是一个标准文件。
 * boolean exists()     测试此抽象路径名表示的文件或目录是否存在。
 */
public class IoIsFileTest {
    public static void main(String[] args) {
        show01();
        System.out.println("=================");
        show02();
    }

    /**
     * boolean isDirectory()测试此抽象路径名表示的文件是否是一个目录。
     *      判断构造方法中的路径是否是一个目录结尾
     *          是:true
     *          否:false
     * boolean isFile()     测试此抽象路径名表示的文件是否是一个标准文件。
     *          判断构造方法中的路径是否是一个文件结尾
     *          是:true
     *          否:false
     *
     * 注意：
     *      电脑中只有文件和文件夹，两个方法是互斥的
     *      这两个方法的使用前提，路径必须是存在的，否则都返回false
     */
    private static void show02() {
        File file1 = new File("C:\\Users\\admin\\Desktop\\无标题2.png");
        if(file1.exists()){
            System.out.println(file1.isDirectory());
            System.out.println(file1.isFile());
        }
        File file2 = new File("C:\\Users\\admin\\Desktop\\无标题.png");
        if(file2.exists()){
            System.out.println(file2.isDirectory());
            System.out.println(file2.isFile());
        }
    }

    /**
     * boolean exists()     测试此抽象路径名表示的文件或目录是否存在。（绝对路径相对路径都可）
     * 判断构造方法的路径是否存在
     *      存在:true;
     *      不存在:false;
     */
    private static void show01() {
        File file = new File("C:\\Users\\admin\\Desktop\\无标题.png");
        System.out.println(file.exists());

        File file2 = new File("C:\\Users\\admin\\Desktop\\无标题2.png");
        System.out.println(file2.exists());
    }
}
