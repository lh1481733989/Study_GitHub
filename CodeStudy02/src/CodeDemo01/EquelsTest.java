package CodeDemo01;

/**
 * equals方法
 * public boolean equals(Object obj) {
 *   return (this == obj);
 * }
 * this是谁：哪个对象调用的方法，p调用方法，this就是p
 * obj是谁：传递过来的参数
 * this==obj --> p = p1
 */
public class EquelsTest {
    public static void main(String[] args) {
        Person person = new Person("林",23,"男");
        Person person1 = new Person("林",23,"男");
        boolean a1 = person.equals(person1);
        System.out.println(a1);

//        person = person1;
        boolean a2 = person.equals(person1);
        System.out.println(a2);
    }

}
