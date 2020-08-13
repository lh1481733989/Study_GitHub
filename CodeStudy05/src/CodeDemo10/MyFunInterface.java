package CodeDemo10;
/**
 * 函数式接口:有且只有一个抽象方法的接口
 * 当然接口中可以包含其他的方法(默认，静态，私有)
 *
 * @FunctionalInterface注解
 * 作用:检测接口是否是一个函数式接口
 *     是:编译通过
 *     否:编译失败(接口中没有抽象方法、抽象方法不止一个)
 */
@FunctionalInterface
public interface MyFunInterface {
    //定义一个抽象方法
    public abstract void method();
}
