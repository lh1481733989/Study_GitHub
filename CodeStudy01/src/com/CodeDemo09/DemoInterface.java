package com.CodeDemo09;

/**
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型，最重要的内容就是其中的：抽象方法
 * 定义一个接口的格式：
 *   public interface 接口名词(){
 *       //接口内容
 *   }
 * 备注：换成了关键字interface，编译生成的字节码文件仍然是 .java -> .class
 *
 * 如果是java7，接口中可以包含的内容：
 * 1.常量
 * 2.抽象方法
 * 如果是java8，接口可以额外包含的内容：
 * 3.默认方法
 * 4.静态方法
 * 如果是java9，接口可以额外包含的内容：
 * 5.私有方法
 *
 * 接口使用的步骤：
 * 1.接口不能直接使用，必须有一个“实现类”来“实现”接口
 * 格式：
 * public class 实现类名称 implements 接口名称{
 *     ...
 * }
 * 2.接口的实现类必须覆盖重写接口中所有的抽象方法
 * 实现：去掉abstract关键字，加上方法体大括号
 * 3.创建实现类对象，进行使用
 *
 * 注意事项：
 * 1.如果实现类并没有覆盖重写接口中的所有抽象方法，那么这个实现类自己必须是抽象类。
 */
public class DemoInterface {
    public static void main(String[] args) {
        //创建实现类对象
        MyInterfaceAbsImpl myInterfaceAbs = new MyInterfaceAbsImpl();
        myInterfaceAbs.methodAbs();
        myInterfaceAbs.methodAbs1();
        myInterfaceAbs.methodAbs2();
    }
}
