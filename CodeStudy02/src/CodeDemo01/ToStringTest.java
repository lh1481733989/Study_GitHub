package CodeDemo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 每个类都是用object作为父类
 * 所有对象（包括数组）都实现这个类的方法
 */
public class ToStringTest {
    /**
     * String Object 返回该对象的字符串表示
     */
    public static void main(String[] args) {
        //直接打印对象的名字，就是在调用toString  p =p.toString();
        //查看一个类是否重写了toString方法，就直接打印这个对象，如果没有重新打印出来的就是该对象的地址值
        Random random = new Random();  // 没有重写toString方法
        System.out.println(random);

        Scanner scanner = new Scanner(System.in); //重写了toString方法
        System.out.println(scanner);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("====================");
        Person person = new Person("lin",18,"nan");
        System.out.println(person.toString());
    }
}
