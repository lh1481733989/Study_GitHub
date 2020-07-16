package CodeDemo03;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Test {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /**
     * 创建集合，使用泛型
     * 好处：
     *      1.避免的类型转换的麻烦 ，存的是什么类型，取出就是什么类型
     *      2.把运行期异常（运行后才有的异常），提升到了编译期（写代码就报错）
     * 弊端：
     *      泛型是什么类型，只能存储什么类型的数据
     */
    private static void show02() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        /*arrayList.add(123);  编译不通过*/
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }

    /**
     * 创建集合对象，不使用泛型
     * 好处：
     *      集合不使用泛型，默认的就是object类型，可以存储任意类型的数据
     * 弊端：
     *      集合将会不安全，会引发异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("w d");

        /*使用迭代器遍历集合*/
        Iterator iterator = list.iterator();
        /*使用迭代器中的方法遍历*/
        while(iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
            /*想要用String的lenght获取字符串的长度；不能使用  多态  Object obj = “abc”  不能使用子类特有的方法需要向下转型*/
            /*会抛出类型转换异常 不能把Integer类型转换成String*/
            /*String str = (String)object;
            System.out.println(str.length());*/
        }

    }

    
}
