/**
 * @Title: TestLoancClass.java 
 * @Package com.bo.wen.ye.initialize 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author A18ccms A18ccms_gmail_com   
 * @date 2018年10月26日 上午10:05:58 
 * @version V1.0 
 */
package com.bo.wen.ye.initialize;

import java.util.Scanner;

/**
 * @ClassName: TestLoancClass
 * @Description: TODO(封装测试)
 * @author yewenbo
 * @date 2018年10月26日 上午10:05:58
 * 
 */
public class TestLoancClass {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        // 以8.25为例,输入年度利率
        System.out.println("Enter annual interest rate,for example, 8.25:");
        double annualInterestRate = input.nextDouble();
        // 进入数年,作为一个整数
        System.out.println("Enter number of years as an integer:");
        int numberOfYears = input.nextInt();
        // 输入贷款金额,例如,120000.95
        System.out.println("Enter loan amount, for example, 120000.95:");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n" +
                " The monthly payment is %.2f\n The total payment is %.2f\n", 
                loan.getLoanDate().toString(),
                loan.getMonthlyPayment(), loan.getToalPayment());
}
}
