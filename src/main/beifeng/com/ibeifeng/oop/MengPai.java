package com.ibeifeng.oop;

public class MengPai {
    String name;
    int age;
    int mengpiaojia;

    public void book(String name, int age) {
        if (age >= 20) {
            System.out.println(name + "的年龄为" + age + ",门票正价20");
        }
        else {
            System.out.println(name + "的年龄为" + age + ",门票免费");
        }
    }


}
