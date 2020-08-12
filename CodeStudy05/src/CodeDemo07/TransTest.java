package CodeDemo07;

import java.io.*;

/**
 * 把GBK的a.txt文件转换成UTF-8的a.txt文件
 */
public class TransTest {
    public static void main(String[] args) throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("UTF_8.txt"),"utf-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("GBK.txt"),"GBK");

        int len = 0;
        while ((len = inputStreamReader.read())!=-1){
            outputStreamWriter.write(len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }
}