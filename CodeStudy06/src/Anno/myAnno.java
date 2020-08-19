package Anno;

import java.lang.annotation.*;

/**
 * 自定义注解：
 *      格式：
 *          元注解
 *          public @interface 注解名{}
 *       本质:本质上就是一个接口 该接口默认继承Annotation接口
 *          public interface myAnno extends java.lang.annotation.Annotation {}
 *       属性：接口中的抽象方法
 *          要求:
 *              1.属性的返回值类型
 *                 基本数据类型
 *                 字符串
 *                 枚举
 *                 注解
 *                 以上类型的数组
 *              2.定义了属性，在使用时需要给属性赋值
 *                 如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不赋值
 *                 如果只有一个属性需要赋值并且属性的名称时value 则value可以省略，直接定义值即可
 *                 数组赋值时，值使用{}包裹，如果数组就一个值，则{}可省略
 *      元注解:用于描述注解的注解
 *              @Target 描述注解能够作用的位置  TYPE 类上 METHOD 方法上 FIELD 成员变量上
 *              @Retention 描述注解能被保留的阶段
 *              @Ducumented 描述注解是否被抽取到API中
 *              @Inherited  描述注解是否被子类继承
 *
 * 小结:
 *      1.大多数的时候 我们会使用注解 而不是自定义注解
 *      2.注解给 编译器 / 解析程序(类似于自己定义的Check)  用
 *      3.注解不是程序的一部分 (标签)
 */
@Target(value = {ElementType.METHOD,ElementType.FIELD,ElementType.TYPE}) //表示myAnno只能作用到方法上
@Retention(value = RetentionPolicy.RUNTIME) //表示myAnno会保留到 SOURCE 源码阶段 CLASS 类加载器阶段 RUNTIME 执行时阶段
@Documented //表示myAnno可被javadoc抽取到文档中
@Inherited  //被子类继承
public @interface myAnno {
    int age();
    String name() default "张三";
    enumPerson enumP();
    MyAnno2 myAnno();
    int[] valueArr();
}
