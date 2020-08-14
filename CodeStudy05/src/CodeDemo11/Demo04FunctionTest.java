package CodeDemo11;

import java.util.function.Function;

/**
 * 常用的函数式接口
 * java.util.function.Function<T></>接口 用来根据一个类型的数据得到另一个类型的数据
 *      前者成为前置条件，后者成为后置条件
 * Function接口最主要的抽象方法是: R apply(T t),根据类型T的参数获取类型R的结果
 *      使用的场景如:将String类型转换为Integer类型。
 */
public class Demo04FunctionTest {
    public static void main(String[] args) {
        String a = "123";
        Function(a,(s)-> Integer.parseInt(s));

        String changeStr = FunciotnAndthen(a, (String str) -> {
             int i = 10;
             return Integer.parseInt(a) + i;
        }, (Integer inte) -> {
            return inte.toString();
        });
        System.out.println(changeStr);

        String changeStrPro = FunciotnAndthen(a,  str -> Integer.parseInt(a) + 10,  inte -> inte.toString());
        System.out.println(changeStrPro);
        System.out.println("---------------------");

        String strName = "赵丽颖,20";
        int endAge = namePro(strName, (str) ->  str.split(",")[1], (str1) -> Integer.parseInt(str1) , (str2) -> str2 + 100);
        System.out.println(endAge);
    }

    /*定义一个方法 方法传递一个String类型的整数 传递Function函数 调用apply方法吧String转换成Integer*/
    public static void Function(String str,Function<String,Integer> function ){
        Integer apply = function.apply(str);
        System.out.println(apply);
    }

    /*andThen默认方法  需求 将字符串转换为整数 再 +10  再转字符串*/
    public static String FunciotnAndthen(String str ,Function<String,Integer> fun1,Function<Integer,String> fun2){
        /*String apply1 = fun2.apply(fun1.apply(str));*/
        String apply1 = fun1.andThen(fun2).apply(str);
        return apply1;
    }

    /*需求 自定义函数模型拼接 将str 赵丽颖,20 中的20变为int 再加100*/
    public static int namePro(String strIn,Function<String,String> function1,Function<String,Integer> function2,Function<Integer,Integer> function3){
        return function1.andThen(function2).andThen(function3).apply(strIn);
    }
}
