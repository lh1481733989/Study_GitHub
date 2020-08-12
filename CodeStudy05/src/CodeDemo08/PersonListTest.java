package CodeDemo08;

import java.io.*;
import java.util.ArrayList;

public class PersonListTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",12));
        list.add(new Person("李四",13));
        list.add(new Person("王五",14));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("a.txt"));
        objectOutputStream.writeObject(list);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("a.txt"));
        Object object = objectInputStream.readObject();
        ArrayList<Person> people  = (ArrayList<Person>)object;
        for (Person person : people) {
            System.out.println(people);
        }
    }
}
