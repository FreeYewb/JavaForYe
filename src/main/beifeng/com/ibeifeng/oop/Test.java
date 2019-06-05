package com.ibeifeng.oop;

public class Test {
    public int calc(int num) {
        num = num + 1;
        return num;
    }

    public void calc2(Students stu) {
        stu.age = stu.age + 1;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int n = 8;
        n = test.calc(n);

        Students stu = new Students();
        stu.age = 18;
        stu = new Students();
        test.calc2(stu);

        System.out.println(n + "----" + stu.age);
    }
}

