package CodeDemo05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map<k,v>集合
 * Map集合的特点
 *      1.Map集合是一个双列集合，一个元素包含两个值(一个key和一个value)
 *      2.Map集合中的元素，key和value的数据类型可相同也可不同
 *      3.Map集合中的元素，key是唯一的
 *      4.Map集合中的元素，key和value是一一对应的
 * java.util.HashMap<k,v>集合 implements Map<k,v>接口
 * HashMap集合的特点：
 *      1.HashMap集合的底层是哈希表：查询快   jdk1.8前(数组+单向链表) jdk1.8后(数组+单向链表/红黑树[链表长度超过8用红黑树])
 *      2.HashMap集合是一个无序的结合，存储集合和取出集合的顺序是不一致的
 * java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
 * LinkedHashMap特点：
 *      1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
 *      2.LinkedHashMap集合是一个有序的集合，存储集合和取出集合的顺序是一致的
 */
public class MapTest {
    public static void main(String[] args) {
        show01();
        System.out.println("=============");
        show02();
        System.out.println("=============");
        show03();
        System.out.println("=============");
        show04();
    }

    /**
     *  boolean containsKey(Object key) 如果此映射包含对于指定键的映射关系，则返回 true。否则返回false
     */
    private static void show04() {
        //创建map集合对象 多态
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",12);
        map.put("赵丽",122);
        map.put("赵",123);
        System.out.println("put:"+map);
        boolean a = map.containsKey("a");/*false*/
        System.out.println("集合中是否有Key："+a);
        boolean b = map.containsKey("赵丽颖");/*ture*/
        System.out.println("集合中是否有Key："+b);
    }

    /**
     *  V get(Object key)返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
     *      返回V:
     *          key存在的时候，v返回对应的value值
     *          key不存在的时候，v返回null
     */
    private static void show03() {
        //创建map集合对象 多态
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",12);
        map.put("赵丽",122);
        map.put("赵",123);
        System.out.println("put:"+map);
        Integer integer = map.get("赵丽颖");
        System.out.println("查询的对应的Key 的value为："+integer);
        Integer integer1 = map.get("迪丽热巴");/*没有就返回null*/
        System.out.println(integer1);
    }

    /**
     * V remove(Object key) 如果存在一个键的映射关系，则将其从此映射中移除（删除）,返回被删除元素的值。
     *  返回V：
     *      key存在的时候，v返回被删除的值
     *      key不存在的时候，v返回null
     */
    private static void show02() {
        //创建map集合对象 多态
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",12);
        map.put("赵丽",122);
        map.put("赵",123);
        System.out.println("put:"+map);

        Integer integer = map.remove("赵");/*删除成功后返回被删除的元素的value 返回值接收用value的数据类型*/
        System.out.println("被删除的value integer:"+integer);
        System.out.println("put:"+map);

        Integer integer1 = map.remove("123");/*删除不存在的元素  返回null*/
        System.out.println(integer1);
    }

    /**
     * public V put(K key, V value)将指定的键值对添加到Map中（新增）。
     *   返回V：
     *         存储键值对的时候，key不重复，返回值V是null
     *         存储键值对的时候，key重复，会使用新的value替换map中的重复key的value值，并返回被替换的value值
     */
    private static void show01() {
        //创建map集合对象 多态
        Map<String,String> map = new HashMap<>();
        String put = map.put("李晨", "范冰冰1");
        System.out.println("put:"+put);

        String put1 = map.put("李晨", "范冰冰2");
        System.out.println("put:"+put1);
        System.out.println(map);

        map.put("杨过","小龙龙");
        map.put("张若尘","小龙龙");
        System.out.println(map);
    }
}
