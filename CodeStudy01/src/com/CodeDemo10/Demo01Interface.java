package com.CodeDemo10;

/**
 * 从java8开始，接口里允许定义默认方法
 * 格式：
 * public default 返回值类型 方法名称(参数列表){
 *     方法体
 * }
 * 备注：接口中的默认方法，可以解决接口升级的问题
 * 1.接口的默认方法，可以通过接口实现类，直接调用
 * 2.接口的默认方法，可以被接口实现类覆盖重写。
 *
 * 从java8开始，接口当中允许定义静态方法
 * 格式：public static 返回值类型 方法名称(参数列表){
 *     方法体
 * }
 * 注意：不能通过接口实现类来调用接口中的静态方法
 * 调用格式：
 * 接口名称.静态方法名称(参数列表);
 *
 * 问题描述：我们需要抽取一个公共方法，用来解决两个默认方法之间重复代码的问题
 * 但是共有方法不应该让实现类使用（应该是私有化的）
 * 解决方案：从java9开始，接口中允许定义私有方法。
 * 1.普通私有方法 解决多个默认方法之间的代码重复问题
 *  格式：private 返回值类型 方法名称(参数列表){
 *      方法体;
 *  }
 *
 * 2.静态私有方法 解决多个静态方法之间的代码重复问题
 *  格式：private static 返回值类型 方法名称(参数列表){
 *      方法体;
 *  }
 *
 */
public interface Demo01Interface {
    //抽象方法
    public abstract void mothod01();
    //新添加的抽象方法 ，直接新增会出错
//    public abstract void method02();
    public default void methoddefault(){
        System.out.println("默认抽象方法");
    }
    public static void methodStatic(){
        System.out.println("静态方法");
    }

    /**

    public default void methoddef(){
        methoddeft();
    }
    public default void methoddef2(){
        System.out.println("默认方法2");
        methoddeft();
    }
     --- java9支持
    private default void methoddeft(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

     **/
}
