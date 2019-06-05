package com.bo.wen.ye.beifeng.inherit;

public class A extends B {
    String pic;

    public A() {
        super();
        System.out.println("这是a类的无参构造方法");
    }

    public A(String name) {
        super(name);
        System.out.println("a类的有参构造方法" + name);
    }

    public A(int e) {
        e = super.num;
        System.out.println("a类的有参构造方法" + e);
    }
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }

    public void show() {

    }
}
