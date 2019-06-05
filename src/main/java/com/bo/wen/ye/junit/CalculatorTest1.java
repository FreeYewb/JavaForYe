package com.bo.wen.ye.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//@ContextConfiguration(locations = { "classpath:spring-context.xml",
//"classpath:spring-context-jedis.xml",
//"classpath:spring-mvc.xml", "classpath:spring-context-shiro.xml",
//"classpath:spring-context-activiti.xml" })
//@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
//@WebAppConfiguration
public class CalculatorTest1 {
    Calculator cal;

    // 在每一个测试代码方法执行之前被调用
    @Before
    public void setup() {
        // 这段代码在这写比较方便，只写一次就够，
        // 不用在每个方法里写，因为这个方法每次都被调用，生成不同的对象，供测试方法使用
        cal = new Calculator();
        // System.out.println("setUp");
    }

    // 在“每个”测试方法执行之后被调用
    @After
    public void tearDown() {
        // System.out.println("testDown");
    }
    // 测试方法：方法名要以test为开头，无参数，无返回类型
    @Test
    public void testAdd() {
        // Calculator cal = new Calculator();
        int result = cal.add(1, 2);
        // 第一个参数是预期结果，第二个参数是实际结果
        Assert.assertEquals(3, result);

    }

    @Test
    public void testsubtract() {
        // Calculator cal = new Calculator();
        int result = cal.subtract(1, 2);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testmultiply() {
        // Calculator cal = new Calculator();
        int result = cal.multiply(1, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testdivide() {
        int result = 0;
        // Calculator cal = new Calculator();
        try {
            result = cal.divide(4, 2);
        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            // 让测试失败
            Assert.fail();
        }
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideZero() {
        Throwable th = null;
        // Calculator cal = new Calculator();
        try {
            cal.divide(1, 0);
            Assert.fail();
        }
        catch (Exception e) {
            // TODO: handle exception
            th = e;
            // e.printStackTrace();
        }
        // th 不为空 null
        Assert.assertNotNull(th);
        Assert.assertEquals(Exception.class, th.getClass());
        Assert.assertEquals("除数不为0", th.getMessage());
    }

    // 加了这个main方法，可以直接以 Java Application 方式运行 ，也可以通过 JUnit Test 运行
    public static void main(String[] args) {
        // 实现接口TestListener的JUnit中就含有：junit.awtui.TestRunner、junit.swingui.
        // TestRunner、junit.ui.TestRunner等，甚至客户用自己的类实现TestListener，从而达到多样化的目的。

        // 命令行形式打印
        // junit.textui.TestRunner.run(CalculatorTest.class);//
        // 它会自动运行CalculatorTest类中以test打头的所有测试用例方法
        // awt 界面方式显示
        // junit.awtui.TestRunner.run(CalculatorTest.class);

        // swing 界面方式显示
        // junit.swingui.TestRunner.run(CalculatorTest.class);
    }
}
