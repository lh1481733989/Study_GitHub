package com.CodeDemo03;

public class Fu {
    int numFu = 10;
    int num = 200;
    public void methodFu(){
        //使用的是本类当中的，不会向下找子类的
        System.out.println(num);
    }
}
