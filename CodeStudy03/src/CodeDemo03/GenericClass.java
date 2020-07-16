package CodeDemo03;

/**
 * 定义一个含有泛型的类，模拟Arraylist集合
 * 泛型：是一种未知的数据类型，当我们不知道用什么数据类型的时候，可以使用泛型
 * 泛型也可以看作一个变量，用来接收数据类型Integer String Object ....
 * 创建对象的时候确定泛型的类型
 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
