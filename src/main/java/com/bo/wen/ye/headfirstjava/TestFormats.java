package com.bo.wen.ye.headfirstjava;

import java.util.Date;

public class TestFormats {
    public static void main(String args[]) {
        // String s = String.format("%,d", 1000000000);
        // String s = String.format("%,.2f", 476578.09876);//476,578.10
        String s = String.format("%.2f,", 476578.09876);// 476578.10,
        Date date = new Date();
        System.out.println(String.format("%tr", date));
        System.out.println(String.format("%tc", date));
        System.out.println(String.format("%tA, %tB %td", date, date, date));
        System.out.println(String.format("%tA, %<tB %<td", date));// <重复使用之前的参数
        System.out.println(s);
    }
}
