package com.bo.wen.ye.jichu.third;

import java.util.Scanner;

/**
 * 
 * @ClassName: LeapYear
 * @Description: TODO(判定闰年)
 * @author yewenbo
 * @date 2018年11月6日 下午3:52:07
 *
 *       如果某年可以被 4 整除而不能被 100 整除，或者可以被 400 整除，那么这一年 就是闰年。
 */
public class LeapYear {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year = input.nextInt();
    
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + "isa leap year" + isLeapYear);
}
}
