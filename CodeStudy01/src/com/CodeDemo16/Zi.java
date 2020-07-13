package com.CodeDemo16;

public class Zi extends Fu {
    @Override
    public void method(){
        System.out.println("子类方法执行");
    }
    //不能重写final方法
    /*public final void methodFu(){
        System.out.println("父类方法执行");
    }*/
}
