package com.CodeDemo08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member member = new Member("A",0);
        Member member1 = new Member("B",0);
        Member member2 = new Member("C",0);

        manager.show();
        member.show();
        member1.show();
        member2.show();
        System.out.println("==============");

        //发红包
        ArrayList<Integer> redList = manager.send(20,3);
        //三个成员收
        member.resave(redList);
        member1.resave(redList);
        member2.resave(redList);
        manager.show();
        member.show();
        member1.show();
        member2.show();
    }
}
