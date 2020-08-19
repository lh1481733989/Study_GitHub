package TestRobot;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 利用反射注解编写 简单测试框架
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //1.创建计算机对象、
        Calculator calculator = new Calculator();
        //2.对计算机对象获取所有方法
        Method[] methods = calculator.getClass().getMethods();
        //3.判断方法是否有check注解

        int sum = 0;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                //4.有的话进行执行
                //5.捕捉异常
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    //6.异常写入文件
                    sum++;
                    bufferedWriter.write(method+" 方法出现异常了");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常的名称是 "+e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常的原因是 "+e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("---------------------");
                    bufferedWriter.newLine();
                }
            }

        }

        bufferedWriter.write("本次测试共出现了 "+sum+" 个 bug");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
