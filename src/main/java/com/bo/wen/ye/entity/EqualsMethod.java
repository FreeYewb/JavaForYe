package com.bo.wen.ye.entity;

public class EqualsMethod {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        System.out.println(v1.i == v2.i);
    }

}
