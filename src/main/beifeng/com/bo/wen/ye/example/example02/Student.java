package com.bo.wen.ye.example.example02;

public class Student {
    public String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 100) {
            throw new StuException("年龄必须在1~100之间");
        }
            this.age = age;
    }

}
