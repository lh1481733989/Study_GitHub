package CodeDemo01;

public class Fu {
    public void show01()throws NullPointerException,ClassCastException{

    }
    public void show02()throws IndexOutOfBoundsException{

    }
    public void show03()throws IndexOutOfBoundsException{

    }
    public void show04(){

    }
}
class Zi extends Fu{
    /*子类重写父类方法时，抛出父类相同的异常*/
    @Override
    public void show01() throws NullPointerException, ClassCastException {
        super.show01();
    }
    /*子类重写父类方法时，抛出 父类异常的子类*/
    @Override
    public void show02()throws ArrayIndexOutOfBoundsException{

    }
    /*不抛出异常*/
    @Override
    public void show03(){

    }
    /*父类方法没有抛出异常，子类重写父类方法也不能抛出异常*/
    /*@Override
    public void show04()*//*throws Exception*//*{

    }*/
    /*类产生该异常，只能捕获处理，不能声明抛出*/
    @Override
    public void show04() /*throws Exception*/{
        try{
            throw new Exception("异常");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
