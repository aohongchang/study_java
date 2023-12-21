package com.Array.exer1;

/**
 * ClassName: PersonTest
 * Package: com.Array
 * StarTime:2023/11/29 20:10
 *
 * @Author :aohongchang
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "关锁";
        p1.age = 18;
        p1.gender = '男';
        System.out.println("名字是" + p1.name + ",年龄是" + p1.age + "，性别是" + p1.gender);



        p1.eat();
        p1.interersts("打篮球");
        p1.sleep(9);
    }
}
