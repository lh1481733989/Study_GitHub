package com.CodeDemo03;

/**
 * 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式
 *
 * 直接通过子类对象访问成员变量
 *      等号左边是谁，就优先用谁，没有则向上找。
 * 简介通过成员方法访问成员变量
 *      该方法属于谁，就优先用谁，没有则想上找
 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建父类对象
        Fu fu = new Fu();
        //只能使用父类的东西，没有任何子类的内容
        System.out.println(fu.numFu);

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);

        //等号左边是谁，就优先用谁
        System.out.println(zi.num);//优先用子类内容
        //System.out.println(zi.abc);  到处都没有则编译报错

        //这个方法是子类的，优先用子类，没有向上找
        zi.methodZi(); // 100
        zi.methodFu(); // 200 方法属于父类

    }
}
