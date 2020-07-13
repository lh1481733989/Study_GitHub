package com.CodeDemo19;

/**
 * 匿名内部类：如果接口的实现类(或者父类的子类)，只需要使用唯一的一次
 * 那么这种情况下就可以省略掉该类的定义，而改为使用匿名内部类
 * 匿名内部类定义格式：
 *  接口名称 对象名 = new 接口名称(){
 *      //覆盖重写所有抽象方法
 *  };
 *
 *  对格式"new 接口名称(){...}"进行解析：
 *  1.new代表创建对象动作
 *  2.接口名称说明匿名内部类需要实现哪个接口
 *  3.{...}才是匿名内部类的内容
 *
 *  注意事项：
 *  1.匿名内部类，在【创建对象】的时候，只能使用唯一一次。
 *  如果希望多次创建对象，而且类的内容一样的话，就必须使用单独定义的实现类了。
 *  2.匿名对象，在【调用方法】的时候，只能调用唯一一次。
 *  如果希望多次调用，则需要给对象起一个名字
 *  3.匿名内部类是省略了【实现类/子类】，但是匿名对象是省略了【对象名称】
 *  强调：匿名内部类和匿名对象不是一回事！！！！！！！！！！！！！！
 *
 */
public class Main {
    public static void main(String[] args) {
        //new实现类对象调用
        MyInterface obj = new MyInterfaceImpl();
        obj.method1();
        System.out.println("====================");

        //使用匿名内部类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了重写接口方法1");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了重写接口方法2");
            }
        };
        myInterface.method1();
        myInterface.method2();
        System.out.println("===================");

        //使用匿名内部类匿名对象调用method1
        new MyInterface(){
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了重写接口方法1");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了重写接口方法2");
            }
        }.method1();
    }
}