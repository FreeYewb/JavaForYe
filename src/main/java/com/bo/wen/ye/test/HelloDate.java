package com.bo.wen.ye.test;

import java.util.Date;

//import static net.mindview.util.Print.*; print();可以直接打印
/**
 * 
 * @author Administrator
 * @version 4.0
 */
public class HelloDate {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello,it's:");
        System.out.println(new HelloDate());
        System.out.println(new Date());
        System.out.println("========================================");
        System.getProperties().list(System.out);
        System.out.println("========================================");
        System.out.println(System.getProperty("user.name"));
        System.out.println("========================================");
        System.out.println(System.getProperty("java.library.path"));
    }

}
