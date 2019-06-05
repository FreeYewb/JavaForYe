package com.bo.wen.ye.jichu.third;

import java.util.Scanner;

/**
 * 
 * @ClassName: TestBooleanOperators
 * @Description: TODO(逻辑操作符)
 * @author yewenbo
 * @date 2018年11月6日 下午3:42:19
 *
 */
public class TestBooleanOperators {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + "is divisible by 2 and 3");// 整除
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + "is divisible by 2 or 3");
        }
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + "is divisible by 2 and 3 ,but not both");
        }
    }

}
