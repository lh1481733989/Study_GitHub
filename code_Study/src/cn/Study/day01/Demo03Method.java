package cn.Study.day01;

/**
 * 用来求出1-100之间所有数字的和
 */
public class Demo03Method {
    public static void main(String[] args) {
        System.out.println(sum());

    }
    public static int sum(){
        int result =0;
        for (int i = 1; i <= 100; i++) {
//            result=result+i;
            result += i;
        }
        return result;
    }
}
