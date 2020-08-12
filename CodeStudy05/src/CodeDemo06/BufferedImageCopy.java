package CodeDemo06;

import java.io.*;

public class BufferedImageCopy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\admin\\Desktop\\1.jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("G:\\1.jpg"));
        int len = 0;
        while ((len=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println("共执行了"+(end-start)+"ms");
    }
}