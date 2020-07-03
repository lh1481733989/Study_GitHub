package com.CodeDemo01.day02;

/**
 * 类的使用
 *
 * 1.导包  import 包名称 类名称
 * 2.创建  类名称  对象名 = new 类名称（）；
 * 3.使用  1.使用成员变量：对象名.成员变量名   2.使用成员变量的方法：对象名.成员方法名()   想用谁，就用对象名点谁
 */
public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age=18;
        stu.name="中";

        System.out.println(stu.name);

        stu.sleep();
    }

}
