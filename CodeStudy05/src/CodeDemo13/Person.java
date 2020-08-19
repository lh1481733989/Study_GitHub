package CodeDemo13;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: "+name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }
}
