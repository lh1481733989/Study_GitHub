package com.CodeDemo01.day03;


import java.util.ArrayList;

/**
 * ArrayList当中的常用方法：
 *
 * public boolean add(E e):向集合中添加元素，参数类型和泛型一致。
 * public E get(int index):从几个中读取元素，参数是索引编号，返回值就是对应位置元素。
 * public E remove(int index):从集合中删除元素，参数是索引编号，返回值是被删除的元素。
 * public int size():获取集合中的尺寸长度，返回值是集合中包含的元素的个数。
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("myname:");
    }
}
