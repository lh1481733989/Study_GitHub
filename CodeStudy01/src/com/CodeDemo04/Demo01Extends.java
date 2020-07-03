package com.CodeDemo04;

/**
 * 局部变量      直接写
 * 本类的成员变量  this.成员变量名
 * 父类的成员变量  super.成员变量名
 *
 *在父类的继承关系中，创建子类对象，访问成员方法的规则：
 *  创建的对象是谁，就优先用谁，如果没有就向上找.
 *
 *注意事项：无论是成员方法还是成员变量，如果没有就向上找父类，不会向下找子类
 *
 * 重写（Override）
 * 概念：在继承关系中，方法名称一样，参数列表一样
 * 重写（Override）:方法名称一样，参数列表一样。【覆盖，覆写】
 * 重载（Overload）:方法名词一样，参数列表不一样
 *
 * 方法的重写的特点：创建的是子类对象，优先用子类的方法
 * 注意事项：
 *      1.必须保证父类子类方法相同，参数列表也相同。
 *      @Override:写在方法前面，用来检测是不是有效的正确重写覆盖。
 *      这个注解就算不写，只要满足要求，也是正确的方法覆盖重写。
 *
 *      2.子类方法的返回值必须小于等于父类方法的返回值范围。
 *      java.lang.Object类是所有公共类的最高父类（祖宗类） java.lang.String就是Object的子类。
 *
 *      3.子类方法的权限必须大于等于父类方法的权限修饰符
 *      public > protected > (default) > private   备注：default不是关键字的default，而是留空，什么也不写
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Zi zi = new Zi();
        //优先用子类方法
        zi.method();
    }
}
