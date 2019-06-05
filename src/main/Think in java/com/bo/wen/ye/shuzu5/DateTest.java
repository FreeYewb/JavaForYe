package com.bo.wen.ye.shuzu5;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        long totalMillliseconds = System.currentTimeMillis();
        long s1 = totalMillliseconds / 1000;
        long nows = s1 % 60;// 当前秒数
        System.out.println(nows);
        long s2 = s1 / 60;// 总分钟数
        long nowf = s2 % 60;// 当前分钟数
        System.out.println(nowf);
        long s3 = s2 / 60;// 总小时数
        System.out.println(totalMillliseconds);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        long nowh = s3 % 24;// 当前小时数

        System.out.println(nowh);
        Date date  = new Date();
        System.out.println(date.getHours());
    }
}
