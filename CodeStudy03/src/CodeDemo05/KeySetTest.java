package CodeDemo05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合中的第一种遍历方式：通过键找值的方法
 * Map集合中的方法：
 *       Set<K> keySet()返回此映射中所包含的键的 Set 视图。
 * 实现步骤：
 *      1.使用Map集合中方法keySet()来把所有的键取出，放入set集合中
 *      2.遍历set集合获取每一个键
 *      3.通过map集合中的get()方法，通过key找到value
 *
 * Map集合中的第一种遍历方式：使用entry键值对对象遍历集合
 * Map集合中的方法：
 *      Set<Map.Entry<K,V>> entrySet() 返回此映射所包含的映射关系的 Set 视图。
 * 实现步骤：
 *      1.使用Map集合方法entrySet()方法，获取每一个键值对对象，存储到一个Set集合中
 *      2.遍历Set集合，获取每一个Entry对象
 *      3.使用getKey()；getValue()获取Entru对象的key和value
 */
public class KeySetTest {
    public static void main(String[] args) {
        show01();
        System.out.println("=============");
        show02();
    }

    /**
     * 使用entry键值对对象遍历集合
     */
    private static void show02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",12);
        map.put("赵丽",122);
        map.put("赵",123);
        System.out.println(map);
        /*1*/
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        /*2*/
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }
        System.out.println("--------");
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String str = next.getKey();
            Integer integer = next.getValue();
            System.out.println("key:"+str+" value:"+integer);
        }
    }

    /**
     * 使用键找值的方法
     */
    private static void show01() {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",12);
        map.put("赵丽",122);
        map.put("赵",123);

        //1.
        Set<String> keySet= map.keySet();
        //2.
        for (String keyset : keySet) {
            Integer value = map.get(keyset);
            //3.
            System.out.println(keyset+":"+value);
        }
    }

}
