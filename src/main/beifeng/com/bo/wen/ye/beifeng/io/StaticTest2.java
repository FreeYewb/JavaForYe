package com.bo.wen.ye.beifeng.io;

public class StaticTest2 {
    int num;

    public static void main(String[] args) {
        StaticTest2 s = new StaticTest2();
        s.num++;
        StaticTest1 st1 = new StaticTest1();
        st1.num++;
        StaticTest1 st2 = new StaticTest1();
        st2.num++;

        s.num++;
        System.out.println(s.num);
}
}
