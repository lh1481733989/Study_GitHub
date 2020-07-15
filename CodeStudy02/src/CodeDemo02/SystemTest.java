package CodeDemo02;

import java.util.Arrays;

/**
 * 系统类system
 * 方法(静态的)：
 *      currentTimeMillis() 返回以毫秒为单位的当前时间。
 *      public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)把一个数组复制到另一个数组中。
 *      src - 源数组。srcPos - 源数组中的起始位置。dest - 目标数组。destPos - 目标数据中的起始位置。length - 要复制的数组元素的数量。
 */
public class SystemTest {
    public static void main(String[] args) {
        method(); 
        method2();
    }

    /**
     * arraycopy
     */
    private static void method2() {
        //元数组
        int[] src = {1,2,3,4,5};
        //目的数组
        int[] dest = {6,7,8,9,10};
        System.out.println("复制前"+ Arrays.toString(dest));
        //arraycopy把元数组中的前三个复制到目的数组的前三个位置上
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后"+ Arrays.toString(dest));
    }

    /**
     * public static long currentTimeMillis();返回以毫秒为单位的当前时间。
     * 用来测试程序效率 例如：打印1-9999所需时间
     */
    private static void method() {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 9999 ; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序共耗时"+(end-start)+"毫秒");

    }
    

}
