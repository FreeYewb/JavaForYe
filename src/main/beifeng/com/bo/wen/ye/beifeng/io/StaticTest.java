package com.bo.wen.ye.beifeng.io;

/**
 * 
 * @ClassName: StaticTest
 * @Description: TODO(类的构造方法用于初始化类的实例，类的静态块用于初始化类，给类的静态变量赋值)
 * @author yewenbo
 * @date 2018年10月16日 上午11:21:26
 *
 */
public class StaticTest {
    static {

        int age = 15;
        System.out.println(age);// 如果上面的变量没加int的话，这行的age其实暂时是不成立的，上面变量实例，下面的才可以使用

    }
    static int age;// 实例出来的变量和上面的不是同一个，没有赋值，所以把上方的变量变为0，按先后顺序的，下面调用的age的值为0；

    public static void main(String[] args) {
        System.out.println(age);

        StaticTest.method(age);

        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("----" + StaticTest.num);
    }

    public static void method(int num) {
        System.out.println(num);
        age += 12;
        System.out.println(age);
    }

    static int num = 100;
    static {
        num += 100;
        System.out.println(num);
    }
    static {
        num += 100;
        System.out.println(num);
    }

}
