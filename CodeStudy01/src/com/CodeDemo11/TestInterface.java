package com.CodeDemo11;

/**
 * 使用接口时注意：
 * 1.接口是没有静态代码块和构造方法的(有构造方法就可以new 接口不可以new)
 * 2.一个类的直接父类是唯一的，但是类可以同时实现多个接口
 * 格式：
 * public class TestInterface implements MyInterface,MyInterfaceA{
 *     //覆盖重写所有抽象方法
 * }
 * 3.如果实现类所实现的多个接口中，存在重复的抽象方法，则只需覆盖重写一次。
 * 4.如果实现类没有覆盖重写所有接口当中的所有抽象方法，则实现类必须是一个抽象类。
 * 5.如果实现类所实现的多个接口中，存在重复的默认方法，那么实现类一定要冲突的默认方法进行覆盖重写。
 * 6.一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先用父类的默认方法。
 *
 */
public class TestInterface implements MyInterface,MyInterfaceA{

    @Override
    public void MethodImpl() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void MethodAbs() {
        System.out.println("都覆盖重写了两个接口中都有的抽象方法");
    }

    @Override
    public void MethodA() {
        System.out.println("覆盖重写了B方法");
    }
}
