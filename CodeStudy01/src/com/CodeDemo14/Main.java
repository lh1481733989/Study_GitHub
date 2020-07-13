package com.CodeDemo14;

/**
 * 对象的向上转换：写法跟多态一样  父类名  名称 = new  子类名();  使用没问题  完全正确
 * 对象的向下转型(还原)，写法 子类名  子类对象名称 = (子类名)父类对象  使用场景：猫对象被当作动物了，不能调用猫的mouse方法
 * 注意：向下转型是还原对象的动作，本来是猫，被当作对象后还原成猫，而不能还原成狗
 * 向下转型一定要instanceos 判断
 */
public class Main {
    public static void main(String[] args) {
        Animals animals = new Cat();
        animals.eat();
        //调用抓老鼠方法失败
//        animals.mouse();
        //向下转型  还原
        Cat cat = (Cat)animals;
        cat.mouse();

        //错误写法  编译不会报错，运行报错classCastException
//        Dog dog = (Dog)animals;
//        dog.eat();

        //例如 女朋友需要一个宠物，什么宠物都行，有宠物了要物尽其用 就需要instanceof判断父类的对象本来是什么(返回值是Boolean值)
        giveAPet(new Dog());
    }

    public static void giveAPet(Animals animals){
        if(animals instanceof Dog){
            Dog dog = (Dog)animals;
            dog.eat();
        }
        if(animals instanceof Cat){
            Cat cat = (Cat)animals;
            cat.mouse();
            cat.eat();
        }
    }
}
