package CodeDemo07;

import java.util.Arrays;
import java.util.Comparator;

public class PersonRambdaTest {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("古力娜扎",38),
                new Person("迪丽热巴",20),
                new Person("张阿生你是",55)
        };

        /*使用匿名内部类排序*/
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        /*使用Rambda表达式*/
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
