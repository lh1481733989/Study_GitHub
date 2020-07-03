package com.CodeDemo04;

public class Zi extends Fu {
    int num = 100;
    public void method(){
        int num = 200;
        System.out.println(num);//200 局部变量
        System.out.println(this.num);//100 本类的成员变量
        System.out.println(super.num);//10 父类的成员变量
        System.out.println("子类的重名方法");
    }

    public void methodZi(){
        System.out.println("子类方法执行");
    }

    @Override
    public String methodOverride(){
        return  null;
    }
}
