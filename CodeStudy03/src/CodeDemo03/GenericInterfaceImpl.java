package CodeDemo03;

/**
 * 含有泛型的接口，使用方式：
 * 1.定义接口实现类，实现接口，指定接口泛型
 *      public interface Iterator<E>{
 *          E next();
 *      }
 *      Scanner类实现了Iterator接口，并指定返回值为String，所以重写的next方法默认也是Stirng
 *      public final class Scannar implements Iterator<String>{
 *
 *      }
 * 2.接口使用什么什么泛型，实现类就使用什么泛型，类跟着接口走
 *   就相当于定义了一个含有泛型的类，创建对象的时候确定泛型的类型
 *   public interface List(){
 *       boolean add();
 *       E get(int index);
 *   }
 *   public class ArrayList<E> implements List<E>{
 *       public boolean add(E e);
 *       public E get(int index);
 *   }
 */

/*方法一*/
//public class GenericInterfaceImpl implements GenericInterface<String>{
//    @Override
//    public void method(String s) {
//        System.out.println(s);
//    }
//}
/*方法二*/
public class GenericInterfaceImpl<I> implements GenericInterface<I>{
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
