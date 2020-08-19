package CodeDemo13;

/**
 * 分析:
 *  lambda表达式的目的，打印参数传递的字符串
 *  把参数s，传递给system.out对象，调用print方法
 * 注意:
 *  system.out对象存在
 *  print方法存在
 *   所以可以使用方法引用来优化lambda表达式
 *   可以使用system.out方法直接引用(调用)print方法
 *
 * 通过对象名引用成员方法
 *      使用前提是对象名是已经存在的，成员方法已经存在的
 *      就可以使用对象名来引用成员方法
 */

public class Demo01Printf {
    public static void main(String[] args) {
        //调用Printf方法，方法参数是一个函数式接口，可用lambda表达式
        printf((str)->{
            System.out.println(str);
        });

        printf(System.out::println);
        System.out.println("-----------");

        //对象的成员方法调用
        printf((str)->{
            MethodRefeObj methodRefeObj = new MethodRefeObj();
            methodRefeObj.Refe(str);
        });

        MethodRefeObj methodRefeObj = new MethodRefeObj();
        printf(methodRefeObj::Refe);
        System.out.println("-----------");

        //对象的静态方法
        printf((s)->{
            MethodRefeObj.RefeLowerCase(s);
        });
        printf(MethodRefeObj::RefeLowerCase);
        System.out.println("-----------");


    }
    //定义一个方法，参数传递PrienI接口，对字符串进行格式化输出
    public static void printf(PrintInterface printInterface){
        printInterface.printf("Hellow World");
    }

}
