package CodeDemo04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * java.util.List接口 extends Collection
 * 三大特点
 *      1.有序的集合，存储元素和取出元素的顺序是一致的（存储的是123，取出的也是123）
 *      2.有索引，包含了一些带索引的方法
 *      3.允许存储重复的元素
 *
 * List接口中带索引的方法(特有)
 *      pubic void add(int index, E element) 在列表的指定位置插入指定元素（可选操作）。
 *      public E get(int index)返回列表中指定位置的元素。
 *      public E remove(int index)移除列表中指定位置的元素（可选操作）。
 *      public E set(int index, E element)用指定元素替换列表中指定位置的元素（可选操作）。
 *
 * 注意：
 *      操作索引的时候，一定要防止索引越界异常
 *          IndexOutOfBoundsException索引越界异常
 *          ArrayIndexOutOfBoundsException数组索引越界异常
 *          StringIndexOutOfBoundsException字符串索引越界异常
 */
public class ListTest {
    public static void main(String[] args) {
        /*创建一个list*/
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);/*[a, a, b, c, d]  不是地址说明重写了toString方法*/

        /*pubic void add(int index, E element) 在列表的指定位置插入指定元素（可选操作）。*/
        list.add(3,"linhao");
        System.out.println(list);/*[a, a, b, linhao, c, d]*/

        /*public E remove(int index)移除列表中指定位置的元素（可选操作）。*/
        String remo = list.remove(2);
        System.out.println("被移除的元素:"+remo);/*b*/
        System.out.println(list);/*[a, a, linhao, c, d]*/

        /*public E set(int index, E element)用指定元素替换列表中指定位置的元素（可选操作）。*/
        String sets = list.set(4,"A");
        System.out.println("被替换的"+sets);
        System.out.println(list);//[a, a, linhao, c, A]
        System.out.println("========================");

        /*遍历*/
        for (int i = 0 ; i < list.size() ; i++){
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("----------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("----------------");
        for(String s :list){
            System.out.println(s);
        }

        /*String a = list.get(6);//IndexOutOfBoundsException
        System.out.println(a);*/
    }
}
