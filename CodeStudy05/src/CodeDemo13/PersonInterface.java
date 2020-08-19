package CodeDemo13;

/**
 * 根据给的姓名创建对象
 */
@FunctionalInterface
public interface PersonInterface {
    public abstract Person builderPerson(String name);
}
