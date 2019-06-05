package com.bo.wen.ye.beifeng.inherit;

public class B extends C {
    public int num = 10;

    public B() {
        super();
        System.out.println("这是b类的无参构造方法");
    }

    public B(String name) {
        System.out.println("b类的有参构造方法" + name);
    }

    public void show() {
        System.out.println(this.addr);
    }
}
