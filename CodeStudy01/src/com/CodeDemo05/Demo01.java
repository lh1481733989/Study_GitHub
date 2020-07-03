package com.CodeDemo05;

public class Demo01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("============");

        Newphone newphone = new Newphone();
        newphone.call();
        newphone.send();
        newphone.show();
    }
}
