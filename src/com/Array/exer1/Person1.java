package com.Array.exer1;

/**
 * ClassName: Person1
 * Package: com.Array
 * StarTime:2023/12/11 23:01
 *用setAge设置合法年龄（0-130），用getAge返回人的年龄。
 * @Author :aohongchang
 */
public class Person1 {
    private int age;


    public void  setAge(int a){
        if (a > 0 && a <= 130){
            age = a;
        }else {
            System.out.println("不合法。");
        }
    }

    public int getAge(){
        return age;
    }




}
