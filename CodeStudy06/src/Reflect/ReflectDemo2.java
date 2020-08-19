package Reflect;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *Class对象功能:
 *    获取功能:
 *      1.获取成员变量们
 *          Field[] getFields()
 *              返回一个包含某些 Field 对象的数组，这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段 public修饰。
 *          Field getField(String name)
 *              返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段 public修饰。。
 *
 *          Field[] getDeclaredFields()
 *              返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段 不考虑修饰符。
 *          Field getDeclaredField(String name)
 *              返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段 不考虑修饰符。
 *      2.获取构造方法们
 *          Constructor<?>[] getConstructors()
 *              返回一个包含某些 Constructor 对象的数组，这些对象反映此 Class 对象所表示的类的所有公共构造方法。
 *          Constructor<T> getConstructor(Class<?>... parameterTypes)
 *              返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
 *
 *          Constructor<?>[] getDeclaredConstructors()
 *              返回 Constructor 对象的一个数组，这些对象反映此 Class 对象表示的类声明的所有构造方法。
 *          Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
 *              返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。
 *      3.获取成员方法们
 *          Method[] getMethods()
 *              返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口（包括那些由该类或接口声明的以及从超类
 *              和超接口继承的那些的类或接口）的公共 member 方法。
 *          Method getMethod(String name, Class<?>... parameterTypes)
 *              返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。
 *
 *          Method[] getDeclaredMethods()
 *              返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和
 *              私有方法，但不包括继承的方法。
 *          Method getDeclaredMethod(String name, Class<?>... parameterTypes)
 *              返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。
 *      4.获取类名
 *          String getName()
 *              以 String 的形式返回此 Class 对象所表示的实体（类、接口、数组类、基本类型或 void）名称
 *
 * Field:成员变量
 *  操作:
 *      1.设置值
 *           Object get(Object obj)返回指定对象上此 Field 表示的字段的值。
 *      2.获取值
 *           void set(Object obj, Object value)将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
 *      3.忽略访问修饰符的安全检查
 *           setAccessible(true)  暴力反射
 *
 * Constructor:构造方法
 *  创建对象:
 *      newInstance(Object... initargs)使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
 *      如果使用空参数的构造方法创建对象，操作是可以简化的:Class对象的newInstance方法
 *      setAccessible(true)  暴力反射
 *
 * Method:执行对象
 *      执行方法Object invoke(Object obj, Object... args)对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
 *      setAccessible(true)  暴力反射
 *       String getName()以 String 形式返回此 Method 对象表示的方法名称。
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        //0.获取person的class对象
        Class personClass = Person.class;

        /*1.获取成员变量们
            Field[] getFields()
            Field getField(String name)
            Field[] getDeclaredFields()
            Field getDeclaredField(String name)
        */
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("---------");

        //获取值
        Field a = personClass.getField("a");
        Person person = new Person();
        Object value = a.get(person);
        System.out.println(value);
        //设置值
        a.set(person,"张三");
        System.out.println(person);
        System.out.println("=========");

        //获取所有成员变量
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field name = personClass.getDeclaredField("name");
        //忽略访问修饰符的安全检查
        name.setAccessible(true);//暴力反射
        Object value2 = name.get(person);
        System.out.println("value2:"+value2); //IllegalAccessException
        System.out.println("-----------------");


        //2.获取构造方法 有参
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Object personCon = constructor.newInstance("张三", 18);
        System.out.println(personCon);
        System.out.println("----------------");
        //获取构造方法  无参
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object personCon1 = constructor1.newInstance();
        System.out.println(personCon1);

        Object newInstance = personClass.newInstance();
        System.out.println(newInstance);
        System.out.println("----------------");


        //3.获取方法
        Method eat = personClass.getMethod("eat");
        Person personMethod = new Person();
        eat.invoke(personMethod);
        Method add = personClass.getMethod("add", int.class, int.class);
        add.invoke(personMethod, 1, 2);
        System.out.println("---------------");
        //所有public修饰的方法  还有继承object的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name1 = method.getName();
            System.out.println(name1);
        }
        System.out.println("-------------------");
        //4.获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}
