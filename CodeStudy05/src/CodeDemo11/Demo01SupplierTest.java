package CodeDemo11;

import java.util.function.Supplier;

/**
 * 常用的函数式接口
 * java.util.function.Supplier<T></>  接口仅包含一个无参的方法:T get() 用来获取一个泛型参数指定类型的对象数据
 *
 * Supplier<T>接口被称为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就生产什么类型的数据
 *
 */
public class Demo01SupplierTest {
    public static void main(String[] args) {
        //调用getString方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        /*String SupplierStr = getString(() -> {
            //生产一个字符串
            return "呼和";
        });*/
        String SupplierStr2 = getString(() -> "呼和");
        System.out.println(SupplierStr2);
        System.out.println("**************************");
        //求数组中的最大值
        int[] arr = {1,10,50,5,6};
        int maxNum = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组的最大值:"+maxNum);

    }
    //定义一个方法，方法的参数传递Supplier<T>接口，泛型指定String，get方法就会返回一个String
    private static String getString(Supplier<String> supplier){
        return supplier.get();
    }
    private static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }
}
