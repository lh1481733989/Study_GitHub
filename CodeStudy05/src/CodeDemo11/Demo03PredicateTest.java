package CodeDemo11;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 常用的函数式接口
 * java.util.function.Predicate<T></>接口
 * 作用：对某种数据类型的数据进行判断，结果返回一个boolean值
 *
 * Predicate接口中包含了一个抽象方法:
 *      boolean test(T t):用来指定输出数据类型进行判断的方法
 *          结果:
 *              符合条件 true
 *              不符合   false
 *
 * 逻辑表达式:可以连接多个判断条件
 * &&:与运算符，有false则false
 * ||:或运算符，有true则true
 * !(取反) :非运算符，非真则假，非假则真
 *
 * 需求:判断两个字符串，有两个判断条件
 *      1.长度是否>5
 *      2.是否包含a
 *      两个条件必须同时满足 使用&&连接两个条件
 *
 * Predicate接口中有个方法and，表示并且关系，也可以用来连接两个判断条件 其方法内部也是使用两个&&运算符连接
 */
public class Demo03PredicateTest {
    public static void main(String[] args) {
        String str = "abcd";
        boolean b = checkString(str, (String strs) -> {
            return strs.length() > 5;
        });
        //优化
        boolean b1 = checkString(str, strs -> strs.length() > 5);
        System.out.println(b);
        System.out.println(b1);
        System.out.println("------------------");

        boolean TwoCheckB = checkTwoAnd(str, (String str1) -> {
            return str.length() > 5;
        }, (String str2) -> {
            return str.contains("a");
        });
        boolean TwoCheckB2 = checkTwoAnd(str,  str1-> str.length() > 5, str2 -> str.contains("a"));
        System.out.println(TwoCheckB);
        System.out.println(TwoCheckB2);
        System.out.println("----------------");

        boolean checkTwoOr = checkTwoOr(str, (String str1) -> {
            return str1.length() > 5;
        }, (String str2) -> {
            return str2.contains("a");
        });
        boolean checkTwoOr2 = checkTwoOr(str, (String str1) -> {
            return str1.length() > 5;
        }, (String str2) -> {
            return str2.contains("a");
        });
        System.out.println(checkTwoOr);
        System.out.println(checkTwoOr2);
        System.out.println("----------------");

        boolean checkNegate1 = checkNegate(str, (String st) -> {
            return str.length() > 5;
        });
        boolean checkNegate2 = checkNegate(str,  st -> str.length() > 5);
        System.out.println(checkNegate1);
        System.out.println(checkNegate2);
        System.out.println("-----------------------");

        String[] arr = {"迪丽热巴,女","马儿扎哈,男","古力娜扎,女","赵丽颖,女"};
        ArrayList<String> array = getStar(arr, (name) -> {
            return name.split(",")[0].length() == 4;

        }, (age) -> {
            return age.split(",")[1].equals("女");
        });
        for (String arra : array) {
            System.out.println(arra);
        }
    }

    /*定义一个方法，参数传递一个String类型的字符串，再传递一个Predicate接口，泛型使用String
    使用Predicate中的test方法对字符串进行判断，并返回判断结果*/
    private static boolean checkString(String s, Predicate<String> predicate){
        return predicate.test(s);
    }

    /*定义一个方法，参数传递一个String类型的字符串，再传递两个个Predicate接口，泛型使用String
    一个用于判断len>5 一个用来判断包含a  并且条件同时满足*/
    //And
    private static boolean checkTwoAnd(String s,Predicate<String>  str1,Predicate<String> str2){
         /*return str1.test(s)&&str2.test(s);*/
         return str1.and(str2).test(s);
    }
    //Or
    private static boolean checkTwoOr(String s,Predicate<String>  str1,Predicate<String> str2){
        /*return str1.test(s)||str2.test(s);*/
        return str1.or(str2).test(s);
    }
    private static boolean checkNegate(String s,Predicate<String>  str1){
        /*return !str1.test(s);*/
        return str1.negate().test(s);
    }

    /*需求 过滤数组  放入集合  条件1 性别为女 条件二  名字为4个字*/
    public static ArrayList<String> getStar(String[] star ,Predicate<String> name,Predicate<String> sex){
        ArrayList<String> list = new ArrayList<>();
        for (String sta : star) {
            boolean test = name.and(sex).test(sta);
            if(test){
                list.add(sta);
            }
        }
        return list;
    }

}
