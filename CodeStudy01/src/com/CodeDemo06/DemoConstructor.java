package com.CodeDemo06;

/**
 * 继承关系中，父子类构造方法的访问特点
 * 1.子类构造方法中有一个隐含默认的“super()”的调用，一定先调用了父类构造，再调用子类构造。
 * 2.子类构造可以通过super关键字来调用父类重载构造。
 * 3.super的父类调用构造，必须是子类构造方法的第一个语句。不能一个子类构造调用多次super构造。
 * 总结：
 * 子类必须调用父类构造方法，不写则赠送super(); 写了则用指定的super调用,super只能有一个，而且只能是第一个。
 *
 * super关键字用来访问父类内容，而this关键字用来访问本类内容
 *
 * Super关键字的三种用法：
 * 1.在子类的成员方法中，访问父类的成员变量。
 * 2.在子类的成员方法中，访问父类的成员方法。
 * 3.在子类的构造方法中，访问父类的构造方法。
 *
 * this关键字的三种方法：
 * 1.在本类的成员方法中，访问本类的成员变量。
 * 2.在本类的成员方法中，访问本类的另一个成员方法。
 * 3.在本类的构造方法中，访问本类的另一个构造方法。（this（...）调用也必须是构造方法的第一个语句 super和this不能同时调用）
 */
public class DemoConstructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
