package com.bo.wen.ye.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

//@ContextConfiguration(locations = { "classpath:spring-context.xml",
//"classpath:spring-context-jedis.xml",
//"classpath:spring-mvc.xml", "classpath:spring-context-shiro.xml",
//"classpath:spring-context-activiti.xml" })
//@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
//@WebAppConfiguration
public class CalculatorTest {
    Calculator cal;

    @Test
    @Ignore
    public void testAdd() {
        cal = new Calculator();
        int result = cal.add(1, 2);
        Assert.assertEquals("加法有问题", 3, result);
        /*
         * "加法有问题"：期望值和实际值不一致时，显示的信息 5 ：期望值 result ：实际值
         */
    }

    @Test
    public void testSubtract() {
        cal = new Calculator();
        int result = cal.subtract(12, 2);
        Assert.assertEquals("减法有问题", 10000, result); // 故意设置减法期望值为10000
    }

    @Test
    public void testMultiply() {
        cal = new Calculator();
        int result = cal.multiply(2, 3);
        Assert.assertEquals("乘法有问题", 6, result);
    }

    @Test
    public void testDivide() {
        cal = new Calculator();
        int result = 0;
        try {
            result = cal.divide(6, 3);
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Assert.assertEquals("除法有问题", 2, result);
    }

}
