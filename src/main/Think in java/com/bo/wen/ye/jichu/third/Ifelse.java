package com.bo.wen.ye.jichu.third;

import java.util.Scanner;

/**
 * 
 * @ClassName: Ifelse
 * @Description: TODO(if，if-else，多分枝if-else)
 * @author yewenbo
 * @date 2018年10月31日 下午2:40:16
 *
 */
public class Ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println("s5");
        }
        if (number % 2 == 0) {
            System.out.println("s2");
        }

        if (number % 5 == 0) {
            System.out.println("s5");
        }
        else {
            System.out.println("ns5");
        }

        if (number % 5 == 0) {
            if (number % 2 == 0) {
                System.out.println("s2");
            }
        }
        else {
            System.out.println("ns5");
        }

        if (number % 5 == 0) {
            System.out.println("s5");
        }
        else if (number % 2 == 0) {
            System.out.println("s2");
        }
        else {
            System.out.println("ns52");

        }

        final double EPSILON = 1E-14;
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        if (Math.abs(x - 0.5) < EPSILON) {
            System.out.println(x + "is 0.5");
        }



    }
}
