package CodeDemo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionTools {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        /*strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");*/

        /*addAll方法  addAll(集合名词  添加元素1，添加元素2, ...)*/
        Collections.addAll(strings,"a","b","c");
        System.out.println(strings);

        /*Collections.shuffle(集合名) 打乱集合中元素顺序*/
        Collections.shuffle(strings);
        System.out.println(strings);//[c, b, a]
        System.out.println("==================");

        /*未排序*/
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(6);
        integers.add(3);
        System.out.println(integers);
        /*排序方法   Collections.sort(集合名)*/
        Collections.sort(integers);
        System.out.println(integers);

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("b");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("============");
        /*对像排序 :被排序的集合，必须实现Comparable接口 重写接口中的CompareTo方法  排序方法：自己(this)-参数 ->升序*/
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("张三",12));
        people.add(new Person("李四",16));
        people.add(new Person("B王五",13));
        people.add(new Person("A王五",13));
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
        /**
         *对象排序 ：Comparable与Comparator比较
         *  Comparable :被排序的集合，必须实现Comparable接口 重写接口中的CompareTo方法  排序方法：自己(this)-参数 ->升序
         *  Comparator :找第三方裁判，比较两个 排序方法：o1-o2 升序
         */
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getAge()-o2.getAge();
                if(result==0){
                    result = o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(people);
    }
}
