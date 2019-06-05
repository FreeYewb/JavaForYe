package com.bo.wen.ye.beifeng.io;

public class Dog {
    private String name;
    private String furColor;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            age = 50;
        }
        this.age = age;
    }

    public Dog(String name, String furColor) {
        this.name = name;
        this.furColor = furColor;

    }

    public Dog(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", furColor=" + furColor + ", age=" + age + "]";
    }

}
