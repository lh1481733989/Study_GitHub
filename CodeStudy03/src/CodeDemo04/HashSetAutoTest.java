package CodeDemo04;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * HashSet集合存储自定义类型元素
 *
 * set集合元素的唯一性：
 *      存储的元素，必须重写hashCode()、equals()方法
 *
 * 要求：同名同年龄只能存储一次
 *
 * java.util.LinkedHashSet集合 extends HashSet集合
 *      底层是一个哈希表（数组+链表/红黑树）+链表 多了一层链表（记录元素的存储顺序），保证元素有序
 */
public class HashSetAutoTest {
    public static void main(String[] args) {
        show01();
        System.out.println("=============");
        show02();
    }
    /**
     *LinkedHashSet集合的有序性
     */
    private static void show02() {
        /*无序的  不重复的*/
        HashSet hashSet = new HashSet();
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add("www");
        hashSet.add("bbb");
        System.out.println(hashSet);
        /*有序的  不重复的*/
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        linkedHashSet.add("www");
        linkedHashSet.add("ddd");
        System.out.println(linkedHashSet);
    }

    /**
     * 未重写HashCode()  equals()方法  不符合HashSet元素唯一性
     */
    private static void show01() {
        HashSet<Person> person = new HashSet<>();
        Person p1 = new Person("张三",12);
        Person p2 = new Person("张三",12);
        Person p3 = new Person("张三",16);
        System.out.println(p1.hashCode());//356573597
        System.out.println(p2.hashCode());//1735600054
        System.out.println(p1==p2);//false
        person.add(p1);
        person.add(p2);
        person.add(p3);
        System.out.println(person); //hashCode和地址值都不同  但是仍然存储进去了[Name:张三 age:12, Name:张三 age:12]
    }
}
