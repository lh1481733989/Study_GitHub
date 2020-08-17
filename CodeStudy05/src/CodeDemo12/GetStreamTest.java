package CodeDemo12;

import java.util.*;
import java.util.stream.Stream;

/**
 * java.util.stream.Stream<T></> 是java 1.8 新加入的最常用的流接口 。 (这不是一个函数式接口)
 * 获取流的方式:
 *      --所有的collection集合都可以通过stream默认方法来获取流
 *           default Stream<E> stream()
 *      --Stream接口的静态方法of可以获取数组对应的流
 *           static <T> Stream<T> of (T...values)
 *           参数是一个可变参数，那么就可以传递一个数组
 */
public class GetStreamTest {
    public static void main(String[] args) {
        //集合转换为stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        //获取键 存为set 变为流
        HashMap<String,String> hashMap = new HashMap<>();
        Set<String> keySet = hashMap.keySet();
        Stream<String> keySetStream = keySet.stream();

        //获取值 存为Collection集合 变为流
        Collection<String> values = hashMap.values();
        Stream<String> valeuStream = values.stream();

        //map映射 存为set 变为流
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Stream<Map.Entry<String, String>> entryStream = entries.stream();

        //数组变流
        Stream<Integer> streamArra = Stream.of(1, 4, 6, 2434, 9, 7);

        //可变参数可以传递数组
        Integer[] arr = {1, 4, 6, 2434, 9, 7};
        Stream<Integer> streamIntArra = Stream.of(arr);
    }
}
