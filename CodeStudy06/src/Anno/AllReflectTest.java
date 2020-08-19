package Anno;

import java.lang.reflect.Method;

/**
 * 框架类
 * 案例:写一个框架，不改变任何代码的前提下，可以帮我们创建任意类的对象，并且执行任意方法
 *
 * 在程序中解析注解  获取注解中定义属性值
 *      1.获取注解定义的位置的对象  class method field
 *      2.获取指定的注解
 *         getAnnotation(xxx.class)
 *      3.调用注解中的抽象方法来获取配置的属性值
 *
 */
@Pro(className = "Anno.Demo2",methodName = "show")
public class AllReflectTest {
    public static void main(String[] args) throws Exception {
        //1 解析注解
        //1.1获取该类的字节码文件对象
        Class<AllReflectTest> allReflectTestClass = AllReflectTest.class;
        //2.获取上边的注解对象
        //其实就是在内存中去生成了一个该注解接口的子类实现对象
        Pro annotation = allReflectTestClass.getAnnotation(Pro.class);
        //3.获取注解对象中定义的抽象方法 来获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();
        System.out.println(className);
        System.out.println(methodName);

        Class classNameI = Class.forName(className);
        Object obj = classNameI.newInstance();
        Method method = classNameI.getMethod(methodName);
        method.invoke(obj);

    }
}
