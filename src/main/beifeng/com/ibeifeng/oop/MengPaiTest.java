package com.ibeifeng.oop;

import java.util.Scanner;

public class MengPaiTest {
    public static void main(String[] args) {
        MengPai man = new MengPai();
        String n = "n";
        while(true){
            if ("n".equals("n"))
        System.out.print("请输入姓名");
        Scanner sr = new Scanner(System.in);
        String name = sr.next();
            if ("n".equals(name)) {
                System.out.println("系统结束");
                break;
            }
        System.out.print("请输入年龄");
        Scanner sr1 = new Scanner(System.in);
        int age = sr1.nextInt();
            man.book(name, age);
        }
    }
}
