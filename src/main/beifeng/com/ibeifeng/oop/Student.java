package com.ibeifeng.oop;

public class Student {
    String name;
    String names[] = new String[5];

    public void add() {
        names[0] = "ss";
        names[1] = "ss1";
        names[2] = "ss2";
        names[3] = "ss3";
        names[4] = "ss4";

    }

    public void search(int start, int end) {
        for (int i = start - 1; i < end; i++) {
            String name = names[i];
            System.out.println(name);
        }
    }
}
