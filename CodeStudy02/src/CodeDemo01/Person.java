package CodeDemo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String sex;

//    /**
//     * Person类中重写toString
//     * @return 返回person字符串(将对象凭拼接成字符串)
//     */
//    @Override
//    public String toString(){
//        return "Person{name="+name+",age="+age+",sex="+sex+"}";
//    }
//
//    /**
//     * 重写equals方法,比较值是否相等  1.增加一个判断 防止类型转换异常   2.空判断(提高程序的效率)
//     * @param obj 传入的值和本对象进行比较
//     * @return
//     */
//    @Override
//    public boolean equals(Object obj) {
//        if(obj==this){
//            return true;
//        }
//        if(obj instanceof  Person && obj!=null){
//        Person person = (Person)obj;
//        boolean b = this.name==person.name&&this.age==person.age&&this.sex==person.sex;
//        return b;
//        }
//        //不是person类型直接返回false
//        return false;
//    }
    //getClass() != o.getClass()使用反射技术判断o是不是Person类型  等效于obj instanceof  Person
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, sex);
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
