package CodeDemo01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection接口
 *     所有单例集合的最顶层的接口，里边定义了所有单列集合共性的方法
 *     任意的单例集合都可以使用Collection接口中的方法
 *
 *     共性的方法：
 *           public boolean add(E e)                把给定的对象元素添加到当前集合当中(新增)。
 *           public void clear()                    移除此 collection 中的所有元素(清空所有元素，不删除集合)（可选操作）。
 *           public boolean remove(Object o)        从此 collection 中移除指定元素的单个实例(删除)，如果存在的话（可选操作）。
 *           public boolean contains(Object o)      如果此 collection 包含指定的元素(包含)，则返回 true。
 *           public boolean isEmpty()               如果此 collection 不包含元素(空)，则返回 true。
 *           public int size()                      返回此 collection 中的元素数(个数)。
 *           public Object[] toArray()              返回包含此 collection 中所有元素的数组，把集合中的元素，存储到数组中。
 */
public class CollectionListTest {
    public static void main(String[] args) {
        /*创建集合对象,可以使用多态*/
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection);//重写了toString方法
        System.out.println("=============");

        /**
         *  public boolean add(E e) 把给定的对象元素添加到当前集合当中(新增)。
         *  返回值是一个boolean值，一般为ture，所以可以不用接收
         */
        boolean b1 = collection.add("张三");
        System.out.println("b1"+b1); //ture
        collection.add("历史");
        collection.add("王五");
        collection.add("赵六");
        collection.add("天气");
        System.out.println(collection);

        /**
         * public boolean remove(Object o)从此 collection 中移除指定元素的单个实例(删除)，如果存在的话（可选操作）。
         * 返回值是一个boolean值:集合中存在元素，删除元素，返回true;集合中不存在元素，删除失败，返回false
         */
        boolean b2 = collection.remove("赵六");
        System.out.println("b2:"+b2);
        boolean b3 = collection.remove("阿里");
        System.out.println("b3:"+b3);

        /**
         * public boolean contains(Object o)      如果此 collection 包含指定的元素(包含)，则返回 true。不包含为false
         */
        boolean b4 = collection.contains("赵六");
        System.out.println("b4:"+b4);
        boolean b5 = collection.contains("天气");
        System.out.println("b5:"+b5);

        /**
         *public boolean isEmpty()               如果此 collection 不包含元素(空)，则返回 true。非空为false
         */
        boolean b6 = collection.isEmpty();
        System.out.println("b6:"+b6);

        /**
         * public int size()                      返回此 collection 中的元素数(个数)。
         */
        int b7 = collection.size();
        System.out.println("b7:"+b7);

        /**
         * public Object[] toArray()              返回包含此 collection 中所有元素的数组，把集合中的元素，存储到数组中。
         */
        Object[] arr = collection.toArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        /**
         * public void clear()                    移除此 collection 中的所有元素(清空所有元素，不删除集合)（可选操作）。
         */
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty());//true
    }
}
