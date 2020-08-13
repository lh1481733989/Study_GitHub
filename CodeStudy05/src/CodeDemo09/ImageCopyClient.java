package CodeDemo09;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ImageCopyClient {
    public static void main(String[] args) throws IOException {
        //1.fileInputStream 创建本地输入到内存的对象
        FileInputStream fileInputStream  = new FileInputStream("C:\\Users\\admin\\Desktop\\无标题.png");
        //2.socket 创建网络绑定
        Socket socket = new Socket("127.0.0.1",8888);
        //3.将字节输出到服务器中
        OutputStream outputStream = socket.getOutputStream();

        int len=0;
        byte[] bytes = new byte[1024];

        while ((len = fileInputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        /*问题提出  由于阻塞  收不到服务区的回馈
          解决: 上传完文件，给服务器写一个结束标记
          void shutdownOutput()禁用此套接字的输出流。
          对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
        */
        socket.shutdownOutput();

        //4.获取网络的输入(回答)
        InputStream inputStream = socket.getInputStream();

        //5.打印获取的网络输入
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //6.释放资源
        fileInputStream.close();
        socket.close();

    }
}
