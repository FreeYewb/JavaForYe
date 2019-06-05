package com.bo.wen.ye.jichu.third;

import java.util.Scanner;

/**
 * 
 * @ClassName: ComputeAndInterpretBMI
 * @Description: TODO(计算体重值，是否肥胖)
 * @author yewenbo
 * @date 2018年10月31日 下午5:38:50
 *
 */
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter weight in pounds
        System.out.println("Enter weight in pounds:磅");
        double weight = input.nextDouble();
        // Prompt the user to enter height in inches
        System.out.println("Enter height in inches:英寸");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Compute BMI
        double weightInkilograms = weight * KILOGRAMS_PER_POUND;
        double heightlnMeters = height * METERS_PER_INCH;
        double bmi = weightInkilograms / (heightlnMeters * heightlnMeters);
        //Display result
        System.out.println("BMI is" + bmi);
        if(bmi <18.5) {
            System.out.println("Underweight重量不足的");
        }
        else if (bmi < 25) {
            System.out.println("Normal正常的");
        }
        else if (bmi < 30) {
            System.out.println("Overweight超重的");
        }else {
            System.out.println("Obese肥胖的");
        }
    }
}
