package com.Array.exer1;

/**
 * ClassName: ArgsTest
 * Package: com.Array
 * StarTime:2023/12/2 10:04
 *
 * @Author :aohongchang
 */
public class ArgsTest {
    public static void main(String[] args) {

        ArgsTest test = new ArgsTest();
        test.print();
        test.print(1);
        test.print(new int[]{1,2,3});



    }

    public void print(int ... nums){
        System.out.println("111111");
    }
    public void print(int i){
        System.out.println("222222");
    }
    public void print(){

    }




}
