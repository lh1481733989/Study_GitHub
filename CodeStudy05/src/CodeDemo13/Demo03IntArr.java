package CodeDemo13;

/**
 * 数组引用
 */
public class Demo03IntArr {
    public static void main(String[] args) {
        /*int[] ints = builderInt(4, (lenght) -> {
            return new int[lenght];
        });*/
        /*int[] ints = builderInt(4, lenght -> new int[lenght]);*/
        int[] ints = builderInt(4,int[]::new);

        System.out.println(ints.length);
    }
    //创建一个方法 方法的参数传递创建数组的长度 和 intBuilerInter接口
    public static int[] builderInt(Integer length,IntBuilderInter intBuilderInter){
        return intBuilderInter.builderInt(length);
    }
}
