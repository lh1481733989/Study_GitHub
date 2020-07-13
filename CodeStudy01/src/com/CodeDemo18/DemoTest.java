package com.CodeDemo18;

/**
 * 如果一个事物内部包含另一个事物，那么这就是一个类内部包含另一个类
 *
 * 分类：
 * 1.成员内部类
 * 定义格式：
 *      修饰符 class 外部类名称(){
 *          修饰符 class 内部类名称(){
 *              ...
 *          }
 *          ...
 *      }
 * 注意：内用外，随意访问； 外用内，需要借助内部类对象
 * =======================
 * 如何使用成员内部类？两种方式
 * a.间接方式：在外部类的方法中，使用内部类，然后main只是调用外部类的方法
 * b.直接方式：公式：【外部类名称.内部类名称  对象名 = new  外部类名称().new 内部类名称();】
 * 内部类的同名变量访问：如果出现了重名现象，格式为：外部类名称.this.外部类变量名
 *
 * 2.局部内部类(包含匿名内部类) 如果一个类是创建在方法内部的，这就是一个局部内部类
 * "局部"：只有当前所属的方法能够使用它，出了方法外面就不能用了。
 * 定义格式：
 *      修饰符 class 外部类名称{
 *          修饰符 返回值类型 方法名(参数列表){
 *              class 局部内部类名称{
 *                  ...
 *              }
 *          }
 *          ...
 *      }
 * 局部内部类，如果希望访问所在方法的变量，这个局部变量必须是【有效final的】。
 * 备注：从java8开始，只要局部变量事实不变，那么final关键字可以省略
 * 原因：a.new出来的对象在堆内存中;
 *      b.局部变量是跟着方法走的，在栈内存中;
 *      c.方法结束之后，立刻出栈，局部变量会立刻消失;
 *      d.但是new出来的对象会在堆中持续存在，知道垃圾回收消失;
 */
public class DemoTest {
    public static void main(String[] args) {
        Body body = new Body();

        body.methodBody();//通过外部类的对象调用外部类的方法，里面在间接使用内部类Heard
        System.out.println("======================");

        Body.Heard heard = new Body().new Heard(); //直接创建内部类的对象，访问方法
        heard.beat();
        System.out.println("======================");

        method();
    }

    //final
    public static void method(){
        final int num = 10;
        class Inner{
            public void InnerMethod(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.InnerMethod();
    }
}
