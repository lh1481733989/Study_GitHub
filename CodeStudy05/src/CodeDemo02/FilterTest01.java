package CodeDemo02;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 *  File[] listFiles(FileFilter filter)    返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录
 *          java.io.fileFilter接口：用于抽象路径名(File对象)的过滤器
 *          作用：
 *               过滤文件(File对象)
 *               抽象方法:用来过滤的方法
 *                  boolean accept(File pathname)测试指定抽象路径名是否应该包含在某个路径名列表中。
 *                  参数：
 *                      File pathname:使用ListFiles方法遍历目录，得到每一个目录对象
 *
 *  File[] listFiles(FilenameFilter filter)返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录
 *          java.io.FilenameFilter接口:可用于过滤器文件名
 *          作用：过滤文件名称
 *          抽象方法:用来过滤名称的方法
 *          boolean accept(File dir, String name)测试指定文件是否应该包含在某一文件列表中。
 *                  参数：
 *                      File dir     构造方法中的传递的被遍历目录
 *                      String name  使用listfiles方法遍历目录，获取每一个文件/文件夹的名称
 * 注意：
 *      两个过滤器接口是没有实现类的，需要自己写实现类，重写过滤的方法，在方法中自己定义过滤的规则
 */
public class FilterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\admin\\Desktop");
        getAllFile(file);
    }
    /**
     * 遍历所有文件  以txt结尾的
     * @param dir 文件路径
     */
    private static void getAllFile(File dir){
       /* File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".txt");
            }
        });//传递过滤对象*/
        File[] files = dir.listFiles((File pathname)->pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".txt"));

        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".txt");
            }
        });*/
        /*File[] files = dir.listFiles( (File d, String name)-> {
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".txt")
        });*/
        /*File[] files = dir.listFiles( ( d,  name)-> new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".txt"));*/

        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else {
                /*获取.txt文件 返回的是boolean*/
                System.out.println(f);

            }
        }
    }
}
