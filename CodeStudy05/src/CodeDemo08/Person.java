package CodeDemo08;

import java.io.Serializable;
import java.util.Objects;

/**
 * InvalidClassException异常 序列化序号不一致
 * 当 Serialization 运行时检测到某个类具有以下问题之一时，抛出此异常。
 *      该类的序列版本号与从流中读取的类描述符的版本号不匹配
 *      该类包含未知数据类型
 *      该类没有可访问的无参数构造方法
 */
public class Person implements Comparable<Person>,Serializable{
    static final long serialVersionUID = 0151511515142L;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Name:"+name+" age:"+age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
    /*重写方法*/
    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}
