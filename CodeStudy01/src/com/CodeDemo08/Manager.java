package com.CodeDemo08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//群主类
public class Manager extends User {

    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    /**
     * 使用平均分
     * @param total 金额
     * @param count 分成份数
     * @return 集合内装有红包
     */
    public ArrayList<Integer> send(final int total , int count){
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

    /**
     * 随机手气
     * @param total 总金额
     * @param count 份数
     * @return
     */
    public List<Integer> sendRan(final int total , int count){
        ArrayList<Integer> list = new ArrayList<>();
        //随机分配 有可能多，有可能少
        //最少1分钱 最多不超过“剩下金额平均数的两倍”
        //第一次发，随机金额就是0.01元~6.66元
        //第一次发完之后，剩下最少时3.34元
        //此时还需在发2个红包
        //此时在发的范围应该是0.01~3.33元

        //总结一下 ， 范围的【公式】是：1+random.nextInt(leftMoney / leftcout * 2)
        Random random = new Random();
        //额外定义两个变量，剩下多少钱，剩下多少份
        int leftMoney = total;
        int leftCout = count;

        //随机发钱n-1个  最后一个不需要随机
        for (int i = 0; i < count  - 1; i++) {
            //生成随机金额
            int money = random.nextInt(leftMoney/leftCout*2) + 1 ;
            list.add(money);
            leftMoney-=money;//金额减少
            leftCout--;//再发次数递减
        }
        //最后一个红包不需要随机
        list.add(leftMoney);

        return list;
    }
}
