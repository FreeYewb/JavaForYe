package com.ibeifeng.oop;

public class Dog {
    String name;
    String furColor;

    public void run() {
        System.out.println(furColor + name);
    }

}

class TestDog {
    public static void main(String[] args) {
        Dog og = new Dog();
        og.furColor = "baise";
        og.name = "wancai";
        og.run();
    }
}
