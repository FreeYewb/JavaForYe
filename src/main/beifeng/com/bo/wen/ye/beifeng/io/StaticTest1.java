package com.bo.wen.ye.beifeng.io;

/**
 * 
 * @ClassName: StaticTest1
 * @Description: TODO(static 的作用： 1、能被类的所有实例共享，可作为实例之间进行交流的共享数据
 *               2、如果类的所有实例都包含一个相同的常量属性，可把这个属性定义为静态常量类型，从而节省内存空间)
 * @author yewenbo
 * @date 2018年10月15日 下午8:50:17
 *
 */
public class StaticTest1 {
    static int num;

    public static void main(String[] args) {
        num++;
        StaticTest1 st1 = new StaticTest1();
        st1.num++;
        StaticTest1 st2 = new StaticTest1();
        st2.num++;

        StaticTest1.num++;
        System.out.println(num);
    }
}
