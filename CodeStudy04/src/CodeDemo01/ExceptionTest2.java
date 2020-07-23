package CodeDemo01;

import java.util.ArrayList;

/**
 * 异常的注意事项：
 *  1.多个异常的处理 运行时异常可不做处理和捕获
 *  2.如果finally有return语句，永远返回finally中的结果，避免该结果
 *  3.子父类异常
 *      如果父类抛出了多个异常，子类重写父类方法时，抛出父类相同的异常或者是父类异常的子类或者不抛出异常
 *      父类方法没有抛出异常，子类重写父类方法也不能抛出异常，此时子类产生该异常，只能捕获处理，不能声明抛出
 *      注意：父类异常是什么样，子类异常就什么样
 *
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        /*ManyThrow();*/
        System.out.println("后续代码");
        System.out.println("==============");

        int a = getA();
        System.out.println(a);
    }
    public static int getA(){
        int a = 10;
        try {
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {/*一定会执行的*/
            a = 100;
            return a;
        }
    }

    /*多个异常的处理
     * 1.多个异常多次捕获，多次处理
     * 2.多个异常一次捕获，依次处理
     * 3.多个异常一次捕获，一次处理
     * */
    public static void ManyThrow(){
        /*1.*/
        try{
            int[] arr = {1,2};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.println(arrayList.get(0));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        /*2*/
        try{
            int[] arr = {1,2};
            System.out.println(arr[3]);
            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.println(arrayList.get(0));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        /*注意事项(1try多catch)：定义一异常变量，如果有父子关系，子类变量必须在上边，否则报错
         * ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         * */
        /*try{
            int[] arr = {1,2};
            System.out.println(arr[3]);
            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.println(arrayList.get(0));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }*/

        /*3*/
        try{
            int[] arr = {1,2};
            System.out.println(arr[3]);
            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.println(arrayList.get(0));
        }catch (Exception e){
            System.out.println(e);
        }
        /*运行时异常可以不捕获也不声明抛出  默认给jvm处理，终止程序，什么时候不抛出运行时异常了，在来继续执行程序*/
        int[] arr = {1,2};
        System.out.println(arr[3]);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.get(0));
    }
}
