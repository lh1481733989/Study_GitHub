package CodeDemo04;

import java.util.LinkedList;

/**
 * java.util.LinkedList集合 implements list接口
 * LinkedList集合特点：
 *      1.底层是一个链表结构（查询慢，增删快）
 *      2.里面包含了大量操作首尾元素的方法
 * 注意：
 *      使用LinkedList集合特有的方法，不能使用多态
 *
 *     public void addFirst(E e)将指定元素插入此列表的开头。
 *     public void addLast(E e)将指定元素添加到此列表的结尾。
 *     public void push(E e)将元素推入此列表所表示的堆栈。
 *
 *     public E getFirst()返回此列表的第一个元素。
 *     public E getLast()返回此列表的最后一个元素。
 *
 *     public E removeFirst()移除并返回此列表的第一个元素。
 *     public E removeLast()移除并返回此列表的最后一个元素。
 *     public E pop()从此列表所表示的堆栈处弹出一个元素。
 */
public class LinkedListTest {
    public static void main(String[] args) {
        show01();
        System.out.println("==========");
        show02();
        System.out.println("==========");
        show03();
    }

    /**
     *     public E removeFirst()移除并返回此列表的第一个元素。
     *     public E removeLast()移除并返回此列表的最后一个元素。
     *     public E pop()从此列表所表示的堆栈处弹出一个元素。
     */
    private static void show03() {
        /*创建一个LinkedList集合*/
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        String removeFirst = linkedList.removeFirst();
        System.out.println(removeFirst);

        String removeLast = linkedList.removeLast();
        System.out.println(removeLast);

        String pop = linkedList.pop();//相当于移除了第一个元素removeFrist
        System.out.println(pop);
    }

    /**
     *     public E getFirst()返回此列表的第一个元素。
     *     public E getLast()返回此列表的最后一个元素。
     */
    private static void show02() {
        /*创建一个LinkedList集合*/
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        /*linkedList.clear();*///清空linkedlist集合后再获取集合元素会抛出NoSuchElementException异常

        if(linkedList.isEmpty()){
            System.out.println("集合中已经无元素了");
        }else{
            String first = linkedList.getFirst();
            System.out.println(first);
            String last = linkedList.getLast();
            System.out.println(last);
        }
    }

    /**
     *     public void addFirst(E e)将指定元素插入此列表的开头。
     *     public void addLast(E e)将指定元素添加到此列表的结尾。
     *     public void push(E e)将元素推入此列表所表示的堆栈。
     */
    private static void show01() {
        /*创建一个LinkedList集合*/
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println(linkedList);

        linkedList.addFirst("www");
        System.out.println(linkedList);
        linkedList.push("ooo");//等效于addFrist
        System.out.println(linkedList);
        linkedList.addLast("0.0");//等效于add()
        System.out.println(linkedList);
    }
}
