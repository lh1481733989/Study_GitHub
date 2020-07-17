package CodeDemo05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap存储自定义键值
 * Map集合保证key是唯一的：
 *      作为key的元素必须重写HashCode()和equels()方法，以保证唯一
 */
public class HashMapAutoTest {
    public static void main(String[] args) {
        show01();
        System.out.println("==========");
        show02();
    }

    /**
     * key:Person  value:String
     * 重写HashCode()和equels()方法，以保证唯一
     */
    private static void show02() {
        //创建
        HashMap<Person,String> hashMap = new HashMap<>();
        //添加元素
        hashMap.put(new Person("张三",18),"北京");
        hashMap.put(new Person("李四",8),"上海");
        hashMap.put(new Person("王五",12),"广州");
        hashMap.put(new Person("张三",18),"北京");

        Set<Map.Entry<Person ,String >> entries = hashMap.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }
    }

    /**
     * key:string  value:Person
     * 重写HashCode()和equels()方法，以保证唯一
     */
    private static void show01() {
        //创建
        HashMap<String,Person> hashMap = new HashMap<>();
        //添加元素
        hashMap.put("北京",new Person("张三",18));
        hashMap.put("上海",new Person("李四",8));
        hashMap.put("广州",new Person("王五",12));
        hashMap.put("北京",new Person("三",20));

        //遍历1.创建set存储entry 2.遍历EntrySet<> 3.获取key value
        Set<Map.Entry<String, Person>> entries = hashMap.entrySet();
        for (Map.Entry<String, Person> entry : entries) {
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
        }
        /*Iterator<Map.Entry<String, Person>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Person> next = iterator.next();
            String Key = next.getKey();
            Person person = next.getValue();
            System.out.println("Key："+Key+" value："+person);
        }
*/
    }
}
