package com.bo.wen.ye.mingrisoft;

import java.util.Scanner;

/**
 * 
 * @ClassName: Example1
 * @Description: TODO(不用乘法运算符实现2*8)
 * @author yewenbo
 * @date 2018年8月28日 下午7:28:46
 *
 */
public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数");
        long number = scan.nextLong();
        System.out.println(1 << 3);
        System.out.println("乘8的结果" + (number << 3));
    }
}
