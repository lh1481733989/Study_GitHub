package com.CodeDemo08;

import java.util.ArrayList;
//群主类
public class Manager extends User {

    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int total , int count){
        //需要一个集合来存储若干红包金额
        ArrayList<Integer> redList =new ArrayList<Integer>();
        //群主有多少钱
        int leftmeney = super.getMoney();
        if(leftmeney<total){
            System.out.println("余额不足");
            return redList;//返回空集合
        }
        //扣钱
        super.setMoney(leftmeney-total);

        //发红包拆分
        int avg  =  total / count ;
        int mod = total % count ;//甩下的零头
        //剩下的零头包在最后一个红包中
        //把这个红包放入集合中
        for (int i = 0; i < count+1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return  redList;
    }
}
