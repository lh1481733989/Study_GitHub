package CodeDemo11;

import java.util.function.Consumer;

/**
 * 常用的函数式接口
 * java.util.function.Consumer<T></>接口正好与Supplier接口相反 为消费一个数据，其数据类型由泛型决定
 * Consumer接口中包含抽象方法void accept(T t),意为消费一个指定泛型的数据
 *
 * Consumer接口是一个消费型接口，泛型执行什么类型，就可以使用accept消费什么类型的数据
 * 至于具体怎么消费(使用)，需要自定义(输出，计算...)
 *
 * Consumer接口的默认方法andThen
 * 作用:可以对两个Consumer接口，可以吧两个Consumer接口组合到一起，对数据进行消费
 * 例如:
 *      Consumer <String > con1
 *      Consumer <String > con2
 *      String s = "hello";
 *      con1.accept(s);
 *      con2.accept(s);
 *      连接两个Consumer接口，再进行消费，谁写前面谁先消费 con1 con2
 *      con1.endThen(con2).accept(s)
 */
public class Demo02ConsumerTest {
    public static void main(String[] args) {
        method("林1",(String name)->{
            //消费方式:对传递进来的字符串消费
            System.out.println(name);

            //消费方式:对传递进来的字符串进行反转输出
            String newName = new StringBuffer(name).reverse().toString();
            System.out.println(newName);

        });
        System.out.println("----------------------");

        //调用method1方法，传递一个字符串和两个表达式
        method1("Lin",
                (String s)->{
                    System.out.println(s.toUpperCase()); // 大写
                },(String s)->{
                    System.out.println(s.toLowerCase()); // 小写
                });
        System.out.println("----------------------");

        //格式化打印信息
        String[] name = {"A,18","B,16","C,32"};
        printInfo(name,(String s1)->{
            String names = s1.split(",")[0];
            System.out.println("姓名:"+names);
        },(String s2)->{
            String age = s2.split(",")[1];
            System.out.println("年龄:"+age+"\r\n");
        });
    }

    //定义一个方法，方法的参数传递一个字符串的姓名，方法参数传递Consumer接口，泛型使用String 可以使用Consumer接口消费字符串的姓名
    private static void method(String name,Consumer<String> consumer){
        consumer.accept(name);
    }

    //定义一个方法，方法的参数传递一个字符串和2个Consumer接口，Consumer接口泛型用String
    private static void method1(String name,Consumer<String> consumer1,Consumer<String> consumer2){
        /*consumer1.accept(name);
        consumer2.accept(name);*/
        //使用andThen方法连接两个Consumer
        consumer1.andThen(consumer2).accept(name);//先消费consumer1 再消费consumer2
    }

    //格式化打印信息
    private static void printInfo(String[] arr,Consumer<String> consumer1,Consumer<String> consumer2){
        for (String arrs : arr) {
            consumer1.andThen(consumer2).accept(arrs);
        }
    }
}
