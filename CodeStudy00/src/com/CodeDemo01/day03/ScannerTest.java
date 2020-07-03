package com.CodeDemo01.day03;

import java.util.Scanner;
/**
 * Scanner类的功能，可以实现键盘的输入数据，到程序中去
 *
 * 引用类型一般的使用步骤:
 *
 * 1.导包 import 包路径.类名称
 * 如果需要使用的目标类，和当前类位于同一包下，则可以不导包，只有java.lang 包下的内容不需要导包，其他包都需要import语句。
 *
 * 2.创建
 * 类对象 对象名 = new 类名称();
 *
 * 3.使用
 * 对象名.成员方法名();
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String Str = scanner.next();
        System.out.println("输入的数值为："+number);
        System.out.println("输入的字符串是："+Str);
    }
}
