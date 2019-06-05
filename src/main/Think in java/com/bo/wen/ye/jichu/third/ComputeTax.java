package com.bo.wen.ye.jichu.third;

import java.util.Scanner;

/**
 * 
 * @ClassName: ComputeTax
 * @Description: TODO(税收)
 * @author yewenbo
 * @date 2018年11月6日 下午3:17:42
 *
 */
public class ComputeTax {

    public double income;
    public static double tax = 0;

    public static double computetax(double income) {
        if (income <= 8350) {
            tax = income * 0.10;
        }
        else if (income <= 33950) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15;
        }
        else if (income <= 82250) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25;
        }
        else if (income <= 171550) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171552 - 82250) * 0.28;
        }
        else if (income <= 372950) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171552 - 82250) * 0.28
                    + (372950 - 171552) * 0.33;
        }
        else {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171552 - 82250) * 0.28
                    + (372950 - 171552) * 0.33 + (income - 372950) * 0.35;
        }
        return tax;
    }

    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter filing status提示用户输入文件状态
        System.out.print("(0-single filer,1-married jointly or" + 
        "qualifying widow(er), 2-married separately, 3-head of" + 
         "household) Enter the filing status:");//输入 0 表示单身纳税人，1表示已婚共同纳税人，2 为已婚单独纳税人，3 为家庭户主纳税人
        
        int status = input.nextInt();
        
        System.out.println("Enter the taxable income");//输入收入
        double income = input.nextDouble();
        
        double tax = 0;//税收
        
        if (status == 0) {
            tax = computetax(income);
        }else if(status == 1) {
            tax = computetax(income);
        }
        else if (status == 2) {
            tax = computetax(income);
        }
        else if (status == 3) {
            tax = computetax(income);
        }
        else {
            System.out.println("Error : invalid status");
            System.exit(1);// System 类中定义的 ，调用这个方法可以终止程序。
            // 参数 status 为 0 表明程序正常结束。一个非 0 的状态代码表示非正常结束。
        }
        System.out.println("Tax is" + (int) (tax * 100) / 100.0);
    }
}
