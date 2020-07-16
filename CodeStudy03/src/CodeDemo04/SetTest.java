package CodeDemo04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util.Set接口 extends Collection 接口
 * Set接口的特点：
 *      1.不允许存储重复的元素；
 *      2.没有索引，没有带索引的方法，也不能使用for循环遍历
 * java.util.HashSet集合 implements Set接口
 * HashSet集合特点：
 *      1.不允许存储重复的元素；
 *      2.没有索引，没有带索引的方法，也不能使用for循环遍历
 *      3.是一个无序的集合，存储元素和取出元素的顺序可能不一致
 *      4.底层是一个哈希表结构（查询速度非常快）
 *
 * 哈希值：是一个十进制的整数，由系统随机给出(就是对象的地址值，是一个逻辑地址，是模拟出来的地址，不是数据实际存储的物理地址)
 * 在Object类中有一个方法，可以获取对象的哈希值
 * int hashCode();返回该对象的哈希值
 * hashCode方法的源码：
 *          public native int hashCode();
 *          native:代表该方法调用的是本地操作系统的方法
 */
public class SetTest {
    public static void main(String[] args) {
        show();
        System.out.println("=============");

        Person person = new Person();
        int i = person.hashCode();
        System.out.println(i);
        Person person1 = new Person();
        int i1 = person1.hashCode();
        System.out.println(i1);
        System.out.println("=============");

        Person person2 = new Person();
        System.out.println(person2.hashCode());
        Person person3 = new Person();
        System.out.println(person3.hashCode());
        System.out.println(person2==person3);//false
        System.out.println("=============");

        show1();
    }


    /**
     * hashset
     */
    private static void show() {
        Set<Integer> set = new HashSet<>();
        //add
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);
        //Iterator
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
        }
        System.out.println("=========");
        //增强for遍历
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
    /**
     * String 方法重写了hashCode
     */
    private static void show1() {
        String s =new String("adb");
        String s1 = new String("adb");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s==s1);
        System.out.println("============");

        String sa= new String("重地");
        String sc= new String("通话");
        System.out.println(sa.hashCode());
        System.out.println(sc.hashCode());
        System.out.println(sa==sc);
        System.out.println("============");

    }
}
