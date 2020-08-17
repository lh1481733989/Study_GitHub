package CodeDemo12;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 使用stream流的方法来遍历集合，对集合中的元素进行过滤
 * stream流是jdk1.8之后出现的
 * 关注的是做什么，而不是怎么做
 *
 * Stream流中的常用方法forEach
 * void forEach(Consumer<? super T> action)
 * 该方法接收一个Consumer函数接口，会将一个流元素交给函数进行处理
 * Consumer接口是一个消费式函数接口，可以传递Lambda 表达式消费数据
 * 简单记:
 *      forEach方法，用来遍历流中的数据
 *      是一个终结方法，遍历之后就不能继续调用stream流中的方法
 *
 * Stream流中常用的方法filter 对于stream流中的数据进行过滤
 * Stream<T> filter(Predicate<? super T> predicate);
 * filter 方法参数Predicate是一个函数接口，传递Lambda表达式，对数据过滤
 * Predicate中的抽象方法
 *      boolean test(T t);
 *
 * 如果需要将流中的元素映射到另一个流中，可以使用map方法
 * <R> Stream<R> map(Function<? super T ,? extends R> mapper);
 * 该接口需要一个Funciton函数式接口，可以将当前流中T类型数据转换成R类型数据的流。
 * Function中的抽象方法:
 *  R apply(T t);
 *
 * Stream流中的常用方法，count，用于统计Stream流中元素的个数
 * long count();
 * count方法是一个终结方法，返回值是一个long类型的整数，所以不能继续调用stream流中的其他方法
 *
 * Stream流中的常用方法，limit，用于截取Stream流中元素的个数
 * limit方法可以对流进行截取，只取前n个，方法签名:
 * Stream<T> limit(long maxSize)
 *   参数是一个long型，如果集合当前长度大于参数则进行截取，否则不操作
 * limit方法是一个延迟方法，只是对流中的元素进行截取，返回的是一个新的流 可以继续调用stream流中的方法
 *
 * Stream流中的常用方法，skip，用于跳过元素
 * 如果希望跳过前几个元素，可以使用skip方法获取一个截取后的新流
 * Stream<T> skip(long n)
 *   如果流的当前长度为n，则跳过前n个，否则就返回长度为0的空流
 *
 * Stream流中的常用方法，concat，把两个流组合到一起
 * 如果有两个流，希望合并到一起，可以使用Stream接口的静态方法concat
 * static<T> stream<T> concat(Stream <? extends T> a,Stream<? extends T> b)
 */
public class ForEachTest {
    public static void main(String[] args) {
        /*传统集合*/
        ArrayList<String> list = new ArrayList<>();
        list.add("宗无忌");
        list.add("无忌");
        list.add("张无忌");
        list.add("张三丰");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------");
        //forEach遍历
        Stream<String> streamList = list.stream();
        streamList.forEach(name-> System.out.println(name));
        System.out.println("--------------------");
        //filter过滤
        Stream<String> streamFilter = list.stream();
        Stream<String> stringStream = streamFilter.filter(name -> name.length() == 3);
        stringStream.forEach(name-> System.out.println(name));
        System.out.println("--------------------");

        /*stream流属于管道流，只能被消费一次
        * 第一个stream流调用完毕方法，数据就会流转到下一个stream流中，而第一个stream流已经使用完毕，就会关闭，
        * so 第一个stream流就不能调用方法  java.lang.IllegalStateException: stream has already been operated upon or closed异常
        * */
        /*streamFilter.forEach(name-> System.out.println(name));*/
        /*System.out.println("-------------------");*/

        //把int 映射为string
        Stream<String> strStream = Stream.of("1","12","3","65" ,"45");
        Stream<Integer> integerStream = strStream.map((String str) -> {
            return Integer.parseInt(str);
        });
        integerStream.forEach(numb-> System.out.println(numb));
        System.out.println("------------------");

        //count获取元素个数
        ArrayList<Integer> listarr= new ArrayList<>();
        listarr.add(1);
        listarr.add(2);
        listarr.add(3);
        listarr.add(4);
        listarr.add(5);
        listarr.add(6);
        Stream<Integer> streamListArr = listarr.stream();
        long count = streamListArr.count();
        System.out.println(count);
        System.out.println("--------------");

        //limit截取
        Stream<String> strLimitStream = Stream.of("1","12","3","65" ,"45");
        Stream<String> limit = strLimitStream.limit(3);
        limit.forEach(num-> System.out.println(num));
        System.out.println("------------------");

        //skip跳过
        Stream<String> strSkipStream = Stream.of("1","12","3","65" ,"45");
        Stream<String> skip = strSkipStream.skip(3);
        skip.forEach(num-> System.out.println(num));
        System.out.println("------------------");

        //concat合并流
        Stream<String> strLimitStream2 = Stream.of("1","12","3","65" ,"45");
        Stream<String> strSkipStream2 = Stream.of("1","12","3","65" ,"45");
        Stream<String> concat = Stream.concat(strSkipStream2, strLimitStream2);
        concat.forEach(name-> System.out.println(name));
        System.out.println("----------------------");
        //忌结尾  三个字 遍历集合
        list.stream()
                .filter((name)-> name.endsWith("忌"))
                .filter((name)->name.length()==3)
                .forEach(name-> System.out.println(name));

    }
}
