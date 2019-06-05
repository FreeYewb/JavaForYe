package com.ibefeng.first04.second.myeunm.example;

public class TestSubject {
    public static void main(String[] args) {
        Subject su = Subject.U1;
        switch (su) {
        case U1:
            System.out.println("u1");
            break;
        case U2:
            System.out.println("u2");
            break;

        default:
            break;
        }
    }
}
