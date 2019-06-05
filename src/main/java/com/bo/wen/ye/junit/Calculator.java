package com.bo.wen.ye.junit;

public class Calculator {
    // 加法
    public int add(int a, int b) {
        return a + b;
    }

    // subtract 减法
    public int subtract(int a, int b) {
        return a - b;
    }

    // 乘法
    public int multiply(int a, int b) {
        return a * b;
    }

    // 除法
    public int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("除数不为0");
        }
        return a / b;


    }
}
