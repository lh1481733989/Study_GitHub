package CodeDemo01;

/**
 * throw关键字
 * 作用：
 *      可以使用throws关键字在指定的方法中抛出指定的异常
 * 使用格式：
 *      throw new xxxException("异常产生的原因");
 * 注意事项：
 *      1.throw关键字必须写在方法的内部
 *      2.throw关键字后边new的对象必须是Exception或者Exception的子类对象；
 *      3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
 *          throw后边创建的是RuntinmeException或者是RuntinmeException的子类对象，我们可以不处理，默认交给jvm处理(打印异常，中断)
 *          throw后边创建的是编译异常,我们就必须处理这个异常，要么throws，要么try...catch
 */
public class ThrowTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int e = getElement(arr,6);
        System.out.println(e);
    }
    /**
     * 定义一个方法，获取数组指定索引处元素
     * @param arr
     * @param index
     * @return ele 数组指定索引处元素
     * 我们首先必须对传递过来的参数进行合法性校验，如果参数不合法，我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有误
     * 注意：
     *      NullPointerException是一个运行期异常，默认交给jvm处理
     *      ArrayIndexOutOfBoundsException是一个运行期异常，默认交给jvm处理
     */
    public static int getElement(int[] arr,int index ){
        /**
         * 对传递过来的参数进行合法性校验 如果arr的值是null，就抛出空指针异常，告知方法的调用者"传递的数组的值为空"
         */
        if(arr == null){
            throw new NullPointerException("传递的数组的值为空");
        }
        /**
         * 对传递过来的参数index进行合法性校验，如果index不在数组的范围内 ，就抛出数组索引越界异常，告知方法调用者
         */
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组的索引越界了");
        }
        int ele = arr[index];
        return ele;

    }
}
