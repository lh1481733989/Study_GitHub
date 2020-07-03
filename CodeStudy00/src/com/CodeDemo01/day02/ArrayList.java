package com.CodeDemo01.day02;

import java.util.Arrays;

/**
 * 面向对象和面向过程
 */
public class ArrayList {
    public static void main(String[] args) {
        int[] ArrayList = { 10, 20, 30, 50};

        //打印出[10,20,30,50]
        //使用面向过程
        System.out.print("[");

        for (int i = 0; i <ArrayList.length ; i++) {
            if(i<ArrayList.length-1){
                System.out.print(ArrayList[i]+",");
            }else{
                System.out.print(ArrayList[i]+"]");
            }

        }
        //使用面向对象搞
        System.out.println(Arrays.toString(ArrayList));
    }
}
