package com.CodeDemo05;

public class Newphone extends  Phone{
    @Override
    public void show() {
        super.show();//把父类的方法拿来重复利用
//        System.out.println("显示号码")
        //添加新的内容
        System.out.println("显示图像");
        System.out.println("显示姓名");
    }
}
