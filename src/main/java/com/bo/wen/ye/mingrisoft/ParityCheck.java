package com.bo.wen.ye.mingrisoft;

import java.util.Scanner;

/**
 * 
 * @ClassName: ParityCheck
 * @Description: TODO(用三元运算符判断奇数和偶数)
 * @author yewenbo
 * @date 2018年8月28日 下午6:57:34
 *
 */
public class ParityCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long number = scan.nextLong();
        String check = (number % 2 == 0) ? "这个数字是：偶数" : "这个数字是：奇数";
        System.out.println(check);
    }
}
