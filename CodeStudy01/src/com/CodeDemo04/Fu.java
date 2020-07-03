package com.CodeDemo04;

public class Fu {
    int num = 10;
    public void methodFu(){
        System.out.println("父类方法执行");
    }

    public void method(){
        System.out.println("父类重名方法");
    }

    public Object methodOverride(){
        return null;
    }
}
