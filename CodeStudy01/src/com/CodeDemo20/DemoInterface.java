package com.CodeDemo20;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List是java.util.ArrayList实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //创建一个list集合用来接收addName的内容
        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String> addName(List<String> list){
        list.add("古力娜扎");
        list.add("迪丽热巴");
        list.add("马儿扎哈");
        return list;
    }
}
