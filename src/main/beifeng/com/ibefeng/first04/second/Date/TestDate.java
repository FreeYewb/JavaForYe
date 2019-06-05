package com.ibefeng.first04.second.Date;

import java.util.Calendar;
import java.util.Date;

public class TestDate {
    public static void main(String args[]) {
        Date date = new Date();
        System.out.println(date);
        Calendar cl = Calendar.getInstance();
        int week = cl.get(Calendar.WEEK_OF_YEAR);
        System.out.println(week);

        cl.set(Calendar.YEAR, 2017);
        cl.set(Calendar.MONTH, 3);
        cl.set(Calendar.DAY_OF_MONTH, 6);
        week = cl.get(Calendar.WEEK_OF_YEAR);
        System.out.println(week);
    }
}
