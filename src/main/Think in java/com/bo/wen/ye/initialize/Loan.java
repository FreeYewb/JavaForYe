package com.bo.wen.ye.initialize;

/**
 * 
 * @ClassName: Loan
 * @Description: TODO(封装类的作用)
 * @author yewenbo
 * @date 2018年10月26日 下午3:14:51
 *
 */
public class Loan {
    private double annualInterestRate;// 年度利率
    private int numberOfYears;// 数年
    private double loanAmount;// 贷款金额
    private java.util.Date loanDate;

    // Default constructor 默认构造方法
    public Loan() {
        this(2.5, 1, 1000);
    }

    // 以指定年度利率构造贷款,年数,贷款金额
    Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    // return annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Set a new annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // return loanAmount
    public double getLoanAmount() {
        return loanAmount;
    }

    // Set a new loanAmount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // return numberOfYears
    public int getNumberOfYears() {
        return numberOfYears;
    }

    // set a new numberOfYears
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    // find monthly payment找到每月付款
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    // Find total payment找到全部付款
    public double getToalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    // Return loan date 返回贷款日期
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
