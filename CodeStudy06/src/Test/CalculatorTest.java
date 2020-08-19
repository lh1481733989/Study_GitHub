package Test;

import JUnit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {
    /**
     * 初始化方法
     * 用于资源的申请，所有测试方法在执行执行都会执行该方法
     */
    @Before
    public void init(){
        System.out.println("init ...");
    }

    /**
     * 释放资源方法
     *      在所有测试方法执行完后都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close ...");
    }

    /**
     * 测试add
     */
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        /*System.out.println(result);*/
        /*断言 我断言的结果是三*/
        Assert.assertEquals(3,result);
    }

    /**
     * 测试sub
     */
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int result = calculator.sub(1, 2);
        /*System.out.println(result);*/
        /*断言 我断言的结果是-1*/
        Assert.assertEquals(-1,result);
    }
}
