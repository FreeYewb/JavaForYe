package com.bo.wen.ye.beifeng.io;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("w", "s", -5);// 如果参数有了，有一个是不合法值，new的对象也是不合法的，封装还有用吗？

        System.out.println(dog);
        System.out.println(dog.getAge());
    }
}
