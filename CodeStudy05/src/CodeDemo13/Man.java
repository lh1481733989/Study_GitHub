package CodeDemo13;

/**
 * 父类super关键字方法引用
 * 本类的this关键字方法引用
 */
public class Man extends HuMan{
    @Override
    public void sayHello() {
        System.out.println(" i am man");
    }
    //传递接口方法
    public void method(SayHello sayHello){
        sayHello.meet();
    }
    //show方法
    public  void show(){
        //父类的方法
        /*method(()->{
            HuMan huMan = new HuMan();
            huMan.sayHello();
        });*/
        /*method(()->{
            super.sayHello();
        });*/
        /*method(super::sayHello);*/

        //子类的方法
        /*method(()->{
            Man man = new Man();
            man.sayHello();
        });*/
        /*method(()->{
            this.sayHello();
        });*/
        method(this::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
