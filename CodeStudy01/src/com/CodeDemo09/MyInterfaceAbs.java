package com.CodeDemo09;

/**
 * 在任何版本java中，接口都可以定义抽象方法：
 *
 * public abstract 返回值类型 方法名(参数列表);
 * 注意事项：
 * 1.修饰符必须是public abstract
 * 2.这两个修饰符可以选择性省略
 * 3.方法的三要素可随意定义
 *
 *
 */
public interface MyInterfaceAbs {
    //皆为抽象方法
    public abstract void methodAbs();
    abstract void methodAbs1();
    public void methodAbs2();
    void methodAbs3();
}
