package CodeDemo02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循环：底层使用的也是迭代器，使用for循环格式，简化了迭代器的书写
 * 是jdk1.5后出现的新特性
 * public interface Collection<E> extends Iterable<E> 所有的单例结合都可以使用增强for循环
 *     public interface Iterable<T> 实现这个接口允许对象成为 "foreach" 语句的目标。
 *
 * 增强for循环：就是用来遍历集合和数组的
 *
 * 格式：
 *      for(集合/数组的数据类型 变量名 : 集合名/数组名){
 *          sout(变量名);
 *      }
 */
public class ForeachTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("张以");
        collection.add("张已");
        collection.add("张一");
        collection.add("张而");
        collection.add("张三");
        //使用增强for来遍历集合
        for(String str : collection){
            System.out.println(str);
        }
    }
}
