package CodeDemo09;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP的服务器端:接收客户端的请求，读取客户端发送的数据，给客户端回写数据
 * 表示服务器的类
 *      java.net.ServerSocket:此类实现服务器套接字、
 *
 * 构造方法:
 *      ServerSocket(int port)创建绑定到特定端口的服务器套接字。
 *
 * 服务器必须明确一件事，必须知道是哪个客户端发的请求
 * 所有可以使用accept方法获取到请求服务器的socket对象
 * 成员方法:
 *      Socket accept()侦听并接受到此套接字的连接。
 *
 * 服务器的实现步骤:
 *      1.创建服务器ServerSocket对象和系统要指定的端口号
 *      2.使用ServerSocket对象中的方法accept，获取到请求服务器的客户端对象Socket
 *      3.使用Socket对象中的getInputStream()获取网络字节输入InputStream对象
 *      4.使用InputStream对象中的read方法，读取客户端发送的数据
 *      5.使用Socket对象中的getOutputStream()方法获取网络字节输出流OutputStream对象
 *      6.使用OutputStream对象中的方法write，给客户端回写数据
 *      7.释放资源(Socket , serverSocket)
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();

        int len=0;
        byte[] bytes = new byte[1024];
        len = inputStream.read(bytes);
        System.out.print(new String(bytes,0,len));

        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("客户端收到".getBytes());
        outputStream.flush();
        accept.close();
        serverSocket.close();
    }
}
