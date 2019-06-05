package com.bo.wen.ye.entity;

public class TestBox {
    int j;
    Integer i = 2;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestBox S = new TestBox();
        S.go();
    }

    public void go() {
        j = i;
        System.out.println(i);
        System.out.println(j);
    }
}
