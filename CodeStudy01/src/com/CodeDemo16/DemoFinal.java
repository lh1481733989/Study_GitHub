package com.CodeDemo16;

/**
 * final关键字代表最终,不可改变的
 *
 * 对于基本类型来说，不可变指的是变量中的数据不可变
 * 对于引用类型来说，不可变指的是变量中的地址值不可变
 *
 * 常用四种用法：
 * 1.用来修饰一个类
 *  public final class 类名称(){
 *      ...
 *  }
 *  含义：当前这个类不能含有任何子类。(太监类)
 *  注意：如果一个类是final，那么其中所有的成员方法无法进行覆盖重写(因为没有子类)
 *
 * 2.用来修饰一个方法
 *  这个方法将变为最终方法，就是不能被覆盖重写
 *  格式：
 *  修饰词 返回值类型 方法名(参数列表){
 *      方法体
 *  }
 *  注意事项：对于类、方法来说，abstract和final关键字不能同时使用，因为矛盾
 *
 * 3.用来修饰一个局部变量
 *   一旦使用final关键字修饰局部变量，那么这个变量不可更改，"一次赋值，终身使用"
 *
 * 4.用来修饰一个成员变量
 *  使用final关键字修饰局部变量，那么这个变量不可更改
 *  1.由于成员变量具有默认值，所有用了final关键字之后必须手动赋值，不会再给默认值了
 *  2.对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值，二者选其一
 *  3.必须保证类的所有重载的构造方法，都最终会给final成员变量进行赋值。
 */
public class DemoFinal {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);

        final int num2 = 200;
        System.out.println(num2);
//        num2=300;  错误写法，不能改变
        final int num3;
        num3 = 100 ;
        System.out.println(num3);
    }

}
