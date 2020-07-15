package CodeDemo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Interator接口：迭代器(对结合进行变量)
 * 有两个常用的方法：
 *       boolean hasNext() 如果仍有元素可以迭代(判断是否还有下一个元素)，则返回 true。
 *       E next()返回迭代的下一个元素。
 * Interator迭代器是一个接口，我们无法直接使用，需要使用Interator接口实现类，获取实现类的方式比较特殊
 * Collection接口中有一个方法，叫interator，这个方法返回的就是迭代器的实现类对象
 *
 * 迭代器的使用步骤：
 *      1.先使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)
 *      2.使用iterator接口中的hasNext判断还有没有下一个元素
 *      3.使用iterator接口中的next方法取出集合中的下一个元素
 */
public class InteratorTest {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> collection = new ArrayList<>();
        collection.add("张以");
        collection.add("张已");
        collection.add("张一");
        collection.add("张而");
        collection.add("张三");

        /*先使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)
        注意：Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型*/
        Iterator<String> iterator = collection.iterator();//多态
        boolean b1 = iterator.hasNext();
        System.out.println(b1);

        String s = iterator.next();
        System.out.println(s);
        System.out.println("=========");

        //优化
        while (iterator.hasNext()){
            String e = iterator.next();
            System.out.println(e);
        }


    }

}
