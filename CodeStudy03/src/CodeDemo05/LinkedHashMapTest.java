package CodeDemo05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
/**
 * java.util.LinkedHashMap<K,V> extends HashMap<K,v>
 * Map接口的哈希表和连接链表实现，具有可预知的迭代性。
 * 底层原理：
 *      哈希表+链表(记录元素的顺序)
 *
 * java.util.HashTable<K,V>集合 implements Map<K,V>接口
 * HahsTable 底层原理是哈希表，是一个线程安全的集合，是单线程集合，速度慢
 * HashMap   底层是哈希表，是一个线程不安全的集合，是多线程集合，速度快
 *
 * HashMap   可以存储null值
 * HashTable 不可存储null值，null键
 *
 * HashTable 和 vector集合一样 ，被更优秀的集合所取代(HashMap,ArrayList)
 * HashTable的子类Properties依旧活跃在历史舞台
 * Properties集合是唯一一个和io流相结合的集合
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        show01();
        System.out.println("============");
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"a");
        hashMap.put(null,"a1");
        hashMap.put(2,null);
        hashMap.put(null,null);
        System.out.println(hashMap);

        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"a");
        /*hashtable.put(null,"a1"); --NullPointerException*/
        /*hashtable.put(2,null); --NullPointerException*/
        System.out.println(hashtable);
    }
    /**
     *LinkedHashMap
     */
    private static void show01() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("c","a");
        hashMap.put("a","b");
        hashMap.put("b","c");
        hashMap.put("c","d");
        System.out.println(hashMap);//无序的key value集合，不允许重复的

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("a","b");
        linked.put("b","c");
        linked.put("c","d");
        linked.put("c","a");
        System.out.println(linked);
    }

}