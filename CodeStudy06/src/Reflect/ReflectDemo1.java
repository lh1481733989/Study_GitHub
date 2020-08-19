package Reflect;

import domain.Person;

/**
 * 反射:框架设计的灵魂
 *      框架:半成品软件，可以在框架的基础上进行软件开发，简化编码
 *      反射:将类的各个组成部分封装为其他对象，就是反射机制
 *      * 好处:
 *          1.可以在程序运行的过程中操作这些对象
 *          2.可以解耦，提高程序扩展性
 *
 * 获取class对象的三种方式
 *          1.Class.forName("全类名"); 将字节码文件加载进内存，返回class对象
 *              多用于配置文件，将类名定义在配置文件中，读取文件加载类
 *          2.类名.class 通过类名的属性class获取
 *              多用于参数的传递
 *          3.对象.getClass getClass()方法在Object类中定义
 *              多用于对象的获取字节码的方式
 *
 * 结论:
 *          同一个字节码文件(*.class)在一次程序的运行中，只会被加载一次，不论通过哪种方式获取的class对象都是同一个
 *
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //1.
        Class personClass1 = Class.forName("domain.Person");
        System.out.println(personClass1);

        //2.
        Class personClass2 = Person.class;
        System.out.println(personClass2);

        //3.
        Person person = new Person();
        Class personClass3 = person.getClass();
        System.out.println(personClass3);

        //== 比较三个对象
        System.out.println(personClass1==personClass2);//true
        System.out.println(personClass1==personClass3);//true
    }
}
