package CodeDemo04;

import java.util.HashSet;

/**
 * Set集合不允许存储重复元素的原理:会先比对hash值是否相同，再进行equals值比对(true认定俩个元素相同，false认定两个元素不同)
 */
public class SetSaveTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");//"abc".equals("abc")  ->  true   所以存储一个
        set.add("重地");//"重地".equals("通话") -> false  所以都存储
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }
}
