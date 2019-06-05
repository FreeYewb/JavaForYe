package com.bo.wen.ye.jichu.third;

import java.util.Scanner;

/**
 * 
 * @ClassName: SubtractionQuiz
 * @Description: TODO(儿童计算出题)
 * @author yewenbo
 * @date 2018年10月31日 下午5:10:03 程序清单3-3
 *
 */
public class SubtractionQuiz {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 1.Generate two random single-digit integers

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        // 3.Prompt the student to answer "What is numberl-number2?”
        System.out.println("What is " + number1 + "-" + number2 + "?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4.Grade the answer and display the result
        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + "-" + number2 + "should be" + (number1 - number2));
        }
    }

}
