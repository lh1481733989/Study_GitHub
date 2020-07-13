package com.CodeDemo15;

/**
 * 测试
 */
public class TestDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用(多态)
        //向上转型
        USB usbMouse = new Mouse();
        computer.usbDevice(usbMouse);

        //键盘
        Keyboard keyboard =new Keyboard();
        computer.usbDevice(keyboard);//正确写法 这里发生了向上转型
        computer.usbDevice(new Keyboard());//正确写法



        computer.powerOff();
    }

}
