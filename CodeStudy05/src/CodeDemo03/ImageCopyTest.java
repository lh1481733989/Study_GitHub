package CodeDemo03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制
 *
 * in:C:\Users\admin\Desktop\1.jpg
 * out:G:\1.jpg
 *
 * 用字节流读取中文会产生的问题
 * 一个中文:
 *      GBK:2个字节
 *      utf-8:3个字节
 *
 */
public class ImageCopyTest {
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        FileInputStream  fis = new FileInputStream("C:\\Users\\admin\\Desktop\\1.jpg");
        FileOutputStream fos = new FileOutputStream("G:\\1.jpg");
        byte[] bytes = new byte[1024];
        int index = 0 ;
        /*while ((index = fis.read())!=-1){
            fos.write(index);
        }*/

        while ((index=fis.read(bytes))!=-1){
            fos.write(bytes,0,index);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("使用了："+(end-start)+"毫秒");
    }
}
