package com.Array.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.Array
 * StarTime:2023/11/28 23:00
 * 数组扩容
 * @Author :aohongchang
 */
public class ArrayExer01 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int[] NewArr = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++){
            NewArr[i] = arr[i];
        }
        NewArr[arr.length] = 10;
        NewArr[arr.length + 1] = 11;
        NewArr[arr.length + 2] = 12;
//将新数组地址赋值给原数组变量
        arr = NewArr;

        for (int i =0; i<arr.length; i++){
            System.out.print(NewArr[i] + " ");
        }

    }
}
