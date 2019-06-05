package com.ibeifeng.oop;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.add();
        for (int i = 0; i < s.toString().length(); i++) {
            System.out.println(i);
        System.out.println(s.toString());
        }
    }

}
