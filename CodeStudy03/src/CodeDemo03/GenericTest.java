package CodeDemo03;

public class GenericTest {
    public static void main(String[] args) {
        /*不使用泛型*/
        GenericClass genericClass = new GenericClass();
        genericClass.setName("ABC");
        System.out.println(genericClass.getName());

        /*使用泛型*/
        GenericClass<String> genericClass1 = new GenericClass<>();
        genericClass1.setName("我的");
        System.out.println(genericClass1.getName());

        /*使用泛型*/
        GenericClass<Integer> genericClass2 = new GenericClass<>();
        genericClass2.setName(123);
        System.out.println(genericClass2.getName());
        System.out.println("===================");

        /*测试含有泛型的方法*/
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.method01(12);
        genericMethod.method01("abc");
        genericMethod.method01(1.1);
        genericMethod.method01(false);
        /*静态*/
        genericMethod.method02("静态方法，不建议用对象使用");
        /*类名.方法名*/
        GenericMethod.method02("建议直接使用");

        /*测试含有泛型的接口*/
        GenericInterfaceImpl genericInterfaceImpl = new GenericInterfaceImpl();
        genericInterfaceImpl.method("a");

        GenericInterfaceImpl<Double> genericInterfaceImpl2 = new GenericInterfaceImpl<>();
        genericInterfaceImpl2.method(2.2);

    }
}
