package com.CodeDemo10;

public class Testimpl implements Demo01Interface {

    @Override
    public void mothod01() {
        System.out.println("实现了方法，AA");
    }

    @Override
    public void methoddefault() {
        System.out.println("实现类A覆盖重写了接口默认方法");
    }
}
