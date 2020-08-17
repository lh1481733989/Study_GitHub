package CodeDemo12;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> team1 = new ArrayList<>();
        team1.add("迪丽热巴");
        team1.add("宋远桥");
        team1.add("属性和");
        team1.add("石破天");
        team1.add("迪丽热巴1");
        team1.add("迪热巴1");
        team1.add("丽热巴");
        //只要名字为三个字的  只要前三个
        Stream<String> stream1 = team1.stream();
        Stream<String> limit = stream1.filter(name -> name.length() == 3).limit(3);

        //只要姓张的  不要前2个
        ArrayList<String> team2 = new ArrayList<>();
        team2.add("张丽热巴");
        team2.add("宋远桥");
        team2.add("张性和");
        team2.add("石破天");
        team2.add("张丽热巴1");
        team2.add("迪热巴1");
        team2.add("张热巴");
        Stream<String> stream2 = team2.stream();
        Stream<String> skip = stream2.filter(name -> name.startsWith("张")).skip(2);
        //合并
        Stream<String> concat = Stream.concat(limit, skip);
        concat.map(name->new Person(name)).forEach(name-> System.out.println(name));
    }
}
