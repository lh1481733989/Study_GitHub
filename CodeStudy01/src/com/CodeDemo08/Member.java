package com.CodeDemo08;

import java.util.ArrayList;
import java.util.Random;
//普通成员
public class Member extends User {
    public Member(){

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void resave(ArrayList<Integer> list){
        //随机抽取一个
        int index = new Random().nextInt(list.size());
        //从集合中删除,并把删除的给自己
        int delta = list.remove(index);
        //获取当前金额
        int money = super.getMoney();
        //加钱并塞回余额
        super.setMoney(money + delta);
    }
}
