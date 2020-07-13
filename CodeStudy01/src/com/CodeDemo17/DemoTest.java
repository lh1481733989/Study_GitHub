package com.CodeDemo17;

/**
 * java四种修饰词
 *               public -> protected -> (default) -> private    (default)代表不写
 * 同一个类       YES       YES          YES          YES
 * 同一个包       YES       YES          YES           NO
 * 不同包子类     YES       YES           NO           NO
 * 不同包非子类   YES        NO           NO           NO
 *
 * 定义一个类的时候，权限修饰符规则
 * 外部类：public / (default)
 * 成员内部类 public / protected / (default) / private
 * 局部内部类 什么都不能写
 */
public class DemoTest {
    private int num = 10 ;
}