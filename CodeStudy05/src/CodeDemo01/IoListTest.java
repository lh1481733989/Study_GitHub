package CodeDemo01;

import java.io.File;

/**
 * public String[] list() 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
 * public File[] listFiles()返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
 *
 * :
 *  list方法和listFiles方法遍历的是构造方法中的目录
 *  如果构造方法给出的路径或目录不存在的时候，会抛出空指针异常
 *  如果构造方法给出的路径不是一个目录，会抛出空指针异常
 */
public class IoListTest {
    public static void main(String[] args) {
        show();
        System.out.println("==============");
        show01();
    }

    /**
     * public File[] listFiles()返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
     * 遍历构造方法中给出的目录。会获取目录中所有的文件/文件夹名称，吧获取到的文件/文件夹封装为file对象，多个file对象存储到file数组中
     */
    private static void show01() {
        File file = new File("C:\\Users\\admin\\Desktop");
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            System.out.println(listFile);/*调用了toString方法*/
        }
    }

    /**
     * public String[] list() 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
     * 遍历构造方法中给出的目录。会获取目录中所有的文件/文件夹名称，吧获取到的多个名称给存储到一个String类型的数组中
     *
     * 能获取到隐藏的文件夹
     */
    private static void show() {
        File file = new File("C:\\Users\\admin\\Desktop");/*目录不存在 不是一个目录时，抛出空指针异常*/
        String[] list = file.list();
        for (String lists : list) {
            System.out.println("fileName:" + lists);
        }
    }
}
