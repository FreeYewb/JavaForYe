package com.ibefeng.first04.first.generic;

public class Student {


    public String name;
    public String sex;

    public Student() {

    }
    public Student(String name, String sex) {

        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
