package CodeDemo03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型的通配符
 *      ?:代表任意数据类型
 * 使用方式
 *      不能创建对象使用
 *      只能作为方法的参数使用
 *
 * 泛型的上限限定 : ? extend E  代表我使用的泛型只能是E类型的子类/本身
 * 泛型的下线限定 : ? super E   代表我使用的泛型只能是E类型的父类/本身
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("我的");
        arrayList.add("向");

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(123);
        arrayList1.add(456);

        printArrayList(arrayList);
        printArrayList(arrayList1);
    }
    /**
     * 使用一个方法遍历集合
     * 遇到问题：调用方法遍历arrayList arrayList1的数据类型报错
     * 解决方法：使用通配符   ？
     * 注意： 泛型是没有继承概念的
     */
    private static void printArrayList(ArrayList<?> e) {
        /*for (ArrayList<?> list : arrayList){
        }*/
        Iterator<?> iterator = e.iterator();
        while (iterator.hasNext()){
            Object itt = iterator.next();
            System.out.println(itt);
        }
    }
}
