package com.CodeDemo11;

/**
 * 接口中可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰
 * 从效果上来看，这其实就是接口的【常量】
 * 格式：
 * public static final 数据类型 常量名称 = 数据值。
 * 备注：一旦使用final关键字修饰，说明不可变
 *
 * 注意：
 * 1.接口当中的常量可以省略public static final  但是照样是public static final
 * 2.接口当中的常量，必须进行赋值，不能不赋值
 * 3.接口中的常量名称，使用完全大写字母，用下划线进行分割
 * 使用方法：接口名称.常量名
 */
public interface MyInterface {
    //这就是个常量，一旦赋值，不可修改
    public static final int NUM = 10;
    public abstract void MethodImpl();
    public abstract void MethodAbs();
}
