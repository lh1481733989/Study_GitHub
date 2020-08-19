package Reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 * 案例:写一个框架，不改变任何代码的前提下，可以帮我们创建任意类的对象，并且执行任意方法
 *      实现:
 *          1.配置文件
 *          2.反射
 *       步骤:
 *          1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 *          2.在程序中加载读取配置文件
 *          3.使用反射技术加载类文件进内存
 *          4.创建对象
 *          5.执行方法
 */
public class AllReflectTest {
    public static void main(String[] args) throws Exception {
        //建任意类的对象，并且执行任意方法
        /* 前提 不能更改该类的任何代码，可以创建任何对象，可以执行任意方法*/
        /*Person person = new Person();
        person.eat();*/
        /*Students students = new Students();
        students.sleep();*/

        //1.加载配置文件
        //1.1创建properties对象
        Properties properties = new Properties();
        //1.2加载配置文件,转换为一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader = AllReflectTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);

        //2.获取配置文件中定义的路径
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3.加载该类进内存，并且创建对象
        Class clsIn = Class.forName(className);

        //4.创建对象
        Object obj = clsIn.newInstance();
        //5.获取方法对象
        Method method = clsIn.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
