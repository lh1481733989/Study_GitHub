package CodeDemo01;

import java.util.Objects;

public class ObjectsTest {
    public static void main(String[] args) {
        //如果出现空的话会抛出空指针异常
        String s1 = "122";
        String s2 = null;
        boolean b = s1.equals(s2);
        System.out.println(b);
        //使用objects类equals方法
        String s3 = "122";
        String s4 = null;
        boolean b1 = Objects.equals(s3,s4);
        System.out.println(b1);
    }

}
