package com.Array.exer2.construct;

/**
 * ClassName: Customer
 * Package: com.Array.exer2.construct
 * StarTime:2023/12/19 22:39
 *
 * @Author :aohongchang
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f ,String l){
        firstName = f;
        lastName = l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAccount(Account a){
        account = a;
    }
    public Account getAccount(){
        return account;
    }



}
