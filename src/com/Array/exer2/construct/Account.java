package com.Array.exer2.construct;

/**
 * ClassName: Account
 * Package: com.Array.exer2.construct
 * StarTime:2023/12/19 22:31
 *
 * @Author :aohongchang
 */
public class Account {
    private int id;//账号
    private double balance; //余额
    private double annualInterestRate;//年利率

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public Account(int i,double b,double a ){
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }

    //取钱
    public void withdraw(double amount){
        if(balance < amount  && amount > 0){
            System.out.println("余额不足,取款失败。");
        }else{
            balance -= amount;
            System.out.println("成功取出：" + amount);
        }
    }
    //存钱
    public void depisit(double amount){
        balance += amount;
        System.out.println("成功存入：" + amount);
    }





}
