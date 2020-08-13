package CodeDemo10;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lambda 返回值  Comparator数组排序
 */
public class Demo03Comparator {
    public static void main(String[] args) {
        String[] a1 = {"12","a","sda"};
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1,getComparator());
        System.out.println(Arrays.toString(a1));
    }

    //返回值类型使用Lambda表达式
    public static Comparator<String> getComparator(){

        //方法的返回值是一个接口，那么我们可以返回这个接口的匿名内部类
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字符串的降序
                return o2.length()-o1.length();
            }
        };*/

        /*方法的返回值是一个函数式接口,所以我们可以返回一个lambda表达式*/
        /*return (String o1, String o2)->{
            return o2.length()-o1.length();
        };*/

        return ( o1,  o2)->o2.length()-o1.length();
    }
}
