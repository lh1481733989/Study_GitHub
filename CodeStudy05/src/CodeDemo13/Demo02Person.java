package CodeDemo13;

/**
 * 类的构造器(构造方法)引用
 */
public class Demo02Person {
    public static void main(String[] args) {
        /*printName("张三",(name)->{
            Person person = new Person(name);
            return person;
        });*/
        /*printName("张三",name-> new Person(name));*/
        printName("张三",Person::new);
    }
    //定义一个方法 方法的参数传递构造接口 方法中通过姓名创建对象
    public static void printName(String name,PersonInterface personInterface){
        Person person = personInterface.builderPerson(name);
        System.out.println(person);
    }
}