package com.Array.exer1;

/**
 * ClassName: RecursionTest
 * Package: com.Array
 * StarTime:2023/12/5 23:17
 *
 * @Author :aohongchang
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        System.out.println(test.getsum(100));


    }
    public int getsum(int num){
        int sum = 0;
        if (num == 1){
            return 1;
        }else{
            sum = getsum(num-1) + num;
        }

        return sum;
    }



    }
