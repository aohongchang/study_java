package com.Array.exer2.construct;

/**
 * ClassName: CustomerTest
 * Package: com.Array.exer2.construct
 * StarTime:2023/12/19 22:45
 *
 * @Author :aohongchang
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cus = new Customer("jane","Smith");
        Account acc = new Account(1000,2000,0.0123);

        cus.setAccount(acc);

        cus.getAccount().depisit(100);
        cus.getAccount().withdraw(960);
        cus.getAccount().withdraw(2000);



    }
}
