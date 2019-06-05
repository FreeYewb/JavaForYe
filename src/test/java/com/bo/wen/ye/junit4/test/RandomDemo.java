package com.bo.wen.ye.junit4.test;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class RandomDemo {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void Demo() {
        Random rnd = new Random(30);
        int code = rnd.nextInt(8999) + 1000;
        System.out.println("code:" + code);
    }

    @Test
    public void Demo1() {
        Random r = new Random(47);
        int nextInt = r.nextInt();
        Random r1 = new Random();
        int nextInt1 = r1.nextInt();
        System.out.println("nextInt:" + nextInt);
        System.out.println("nextInt2:" + nextInt1);
    }

    /**
     * 生成[0,1.0)区间的小数
     * 
     */
    @Test
    public void Demo2() {
        Random r = new Random();
        double d1 = r.nextDouble();
        System.out.println("d1:" + d1);
    }

    /**
     * 生成[0,5.0)区间的小数
     * 
     */
    @Test
    public void Demo3() {
        Random r = new Random();
        double d1 = r.nextDouble() * 5;
        System.out.println("d1:" + d1);
    }

    /**
     * 生成[1,2.5)区间的小数
     * 
     */
    @Test
    public void Demo4() {
        Random r = new Random();
        double d3 = r.nextDouble() * 1.5 + 1;
        System.out.println("d1:" + d3);
    }

    /**
     * 生成任意整数
     * 
     */
    @Test
    public void Demo5() {
        Random r = new Random();
        int n1 = r.nextInt();
        System.out.println("d1:" + n1);
    }

    /**
     * 生成[0,10)区间的整数
     * 
     */
    @Test
    public void Demo6() {
        Random r = new Random();
        // =============================================第一种
        int n2 = r.nextInt(10);// 生成[0,10)区间的整数
        System.out.println(n2);
        // =============================================第二种
        int n4 = r.nextInt();// 生成任意整数，有可能是负数
        System.out.println(n4);
        int n3 = n4 % 10;// 求余 ，有可能因为是负数，取得的余是负数
        System.out.println(n3);
        int n5 = Math.abs(n3);// 把上面的值进行绝对值
        System.out.println(n5);
    }
    
    /**
     * 生成[0,11]区间的整数
     * 
     */
    @Test
    public void Demo7() {
        Random r = new Random();
        int n3 = r.nextInt(11);
        int n4 = Math.abs(r.nextInt() % 11);
        System.out.println("n3:" + n3);
        System.out.println("n4:" + n4);
    }

    /**
     * 生成[-3,15)区间的整数
     * 
     */
    public void Demo8() {
        Random r = new Random();
        int n4 = r.nextInt(18) - 3;
        int n5 = Math.abs(r.nextInt() % 18) - 3;
        System.out.println("n4:" + n4);
        System.out.println("n5:" + n5);
    }
}
