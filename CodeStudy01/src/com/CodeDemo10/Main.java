package com.CodeDemo10;

public class Main {
    public static void main(String[] args) {
        //创建实现类对象
        Testimpl testimpl = new Testimpl();
        testimpl.mothod01();//调用抽象方法，实际上运行的是右侧的实现类
        //调用默认方法，如果实现类没有，会向上找接口的
        testimpl.methoddefault();
        //接口静态方法错误写法
//        testimpl.methodStatic;
        //接口静态方法正确用法
        Demo01Interface.methodStatic();
        System.out.println("==============");

        Testimpl2 testimpl2 = new Testimpl2();
        testimpl2.mothod01();
        testimpl2.methoddefault();
    }
}
