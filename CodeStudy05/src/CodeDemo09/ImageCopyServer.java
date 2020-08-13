package CodeDemo09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ImageCopyServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器的对象 向服务器要端口号
        ServerSocket serverSocket = new ServerSocket(8888);

    /*
    **** 让服务器一直处于监听状态，有一个上传就保存一个
    **** while效率地下，使用多线程，来一个就开一个线程
    */
        while (true){
            //2.获取client对象  等待请求
            Socket accept = serverSocket.accept();
            //开启多线程
            new Thread(()->{
                try {
                    //3.client对象获取网络输入
                    InputStream acceptInputStream = accept.getInputStream();

                    //4.创建文件写的对象
                    File file = new File("G:\\upload");
                    if(!file.exists()) {
                        file.mkdirs();
                    }
                    /*
                    自定义一个文件的命名规则，防止同名的文件被覆盖
                    规则，域名+毫秒值+随机数
                    */
                    String fileName = "Com"+System.currentTimeMillis()+ new Random().nextInt(999999)+".jpg";

                    FileOutputStream fileOutputStream = new FileOutputStream(file+"\\"+fileName);

                    //5.网络输入写入到服务器硬盘中
                    int len =0;
                    byte[] bytes = new byte[1024];
                    while ((len = acceptInputStream.read(bytes))!=-1){
                        fileOutputStream.write(bytes,0,len);
                    }

                    //6.使用网络socket给client一个回答
                    accept.getOutputStream().write("上传成功".getBytes());

                    //7.释放资源
                    fileOutputStream.close();
                    accept.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }).start();
        }
        /*就不用关闭服务器了*/
        //serverSocket.close();
    }
}
