package com.bo.wen.ye.jichu.third;

import java.util.Scanner;

/**
 * 
 * @ClassName: AdditionQuiz
 * @Description: TODO(真假程序)
 * @author yewenbo
 * @date 2018年10月31日 上午11:26:16 程序清单3-1
 */
public class AdditionQuiz {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number1 = (int)(System.currentTimeMillis()%10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("what is " + number1 + "+" + number2 + "?");
        int answer = input.nextInt();
        System.out.println("answer:" + answer + "," + (number1 + number2 == answer));


    }

}
