package CodeDemo01;

import java.util.Scanner;

public class AutoExceptionTest {
    /*①*/
    static String[] username= {"张三","李四","王五"};
    public static void main(String[] args) /*throws XXXExceptionTest*/ {
        /*②*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的用户名");
        String scnext = scanner.next();
        try {
            cleckName(scnext);
        }catch (XXXExceptionTest e ){
            System.out.println(e);
        }
    }
    /*③*/
    public static void cleckName(String name) throws XXXExceptionTest {
        for (String s : username) {
            if(s.equals(name)){
                throw new XXXExceptionTest("用户已注册");
            }
        }
        System.out.println("注册完成");
    }
}