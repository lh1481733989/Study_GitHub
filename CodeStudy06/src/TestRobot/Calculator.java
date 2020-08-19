package TestRobot;

public class Calculator {
    /**
     * 加法
     */
    @Check
    public void add(){
        System.out.println("a + b  = " + (1+1));
    }

    /**
     * 减法
     */
    @Check
    public void sub() {

        System.out.println("a - b  = " + (1-1));
    }
    /**
     * 乘法
     */
    @Check
    public void mul(){
        System.out.println("a * b  = " + (1*1));
    }

    /**
     * 除法
     */
    @Check
    public void div(){
        System.out.println("a / b  = " + 10/0);
    }
}
