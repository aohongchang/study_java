package com.Array.exer1;

/**
 * ClassName: Employee
 * Package: com.Array
 * StarTime:2023/12/11 23:31
 *
 * @Author :aohongchang
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInfo(){
        return getName() + "\t\t" + getAge() + "\t\t" + getGender() + "\t\t" + getPhoneNumber();
    }




}
