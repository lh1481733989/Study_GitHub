package com.CodeDemo18;

public class Body {
    private String name;

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }


    //外部类方法
    public void methodBody(){
        System.out.println("外部类方法");
        new Heard().beat();
    }

    public class Heard{//成员内部类
        //成员内部类方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫"+name);
        }
    }


}
