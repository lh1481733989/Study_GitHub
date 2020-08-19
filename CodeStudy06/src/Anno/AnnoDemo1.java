package Anno;

/**
 * JDK内置的注解:
 * * @Override 检测该注解标注的方法是否继承于父类/接口的
 * * @Deprecated 该注解标注的内容，表示已经过时
 * * @SuppressWarnings 压制警告 一般传递参数all @SuppressWarnings("all")
 */
@SuppressWarnings("all")
public class AnnoDemo1 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        System.out.println("show1");
    }
    public void show2(){
        System.out.println("show2");
    }

    @myAnno(age=12,enumP = enumPerson.P1,myAnno = @MyAnno2,valueArr = {1,2,3 })
    public void demo(){
        show1();
    }
}
