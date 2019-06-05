package com.bo.wen.ye.mingrisoft;

import java.util.Scanner;

/**
 * 
 * @ClassName: VariableExchange
 * @Description: TODO(实现俩个数的对换，不借第三方)
 * @author yewenbo
 * @date 2018年8月28日 下午8:15:44
 *
 */
public class VariableExchange {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("请输入变量c的值");
        String c = scan.nextLine();
        System.out.println(c.hashCode());
        System.out.println("请输入变量A的值");
        long A = scan.nextLong();
        System.out.println("请输入变量B的值");
        long B = scan.nextLong();

        A = A ^ B;
        B = B ^ A;

        A = B ^ A;
        // A = A ^ B;
        System.out.println("A:" + A + "," + "B:" + B);
    }
}
