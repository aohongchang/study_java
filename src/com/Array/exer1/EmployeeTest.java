package com.Array.exer1;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Package: com.Array
 * StarTime:2023/12/11 23:37
 *
 * @Author :aohongchang
 */
public class EmployeeTest {
    public static void main(String[] args) {
       // Employee emp = new Employee();
//        emp.setAge(18);
//        emp.setGender('男');
//        emp.setName("关锁");
//        emp.setPhoneNumber("198323232");
//        System.out.println(emp.getInfo());
        Employee[] emp = new Employee[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < emp.length; i++){

            emp[i] = new Employee();

            System.out.println("------------添加第" + (i + 1) + "个员工----------");
            System.out.print("姓名：");
            String name = sc.next();
            System.out.print("性别：");
            char gender = sc.next().charAt(0);
            System.out.print("年龄：");
            int age = sc.nextInt();
            System.out.print("电话号：");
            String number = sc.next();

            //给指定对象赋值
            emp[i].setName(name);
            emp[i].setGender(gender);
            emp[i].setAge(age);
            emp[i].setPhoneNumber(number);
        }
        //遍历
        System.out.println("------------员工列表----------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < emp.length; i++){
            System.out.println((i+1) +"\t\t" + emp[i].getInfo());
        }
        System.out.println("------------员工列表完成----------");




    }
}
