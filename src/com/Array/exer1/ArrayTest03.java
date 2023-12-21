package com.Array.exer1;

/**
 * ClassName: ArrayTest03
 * Package: com.Array
 * StarTime:2023/11/28 22:38
 * @Author :aohongchang
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        for (int i = 0 ; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        for (int i = 0 ; i< array.length; i++){
            System.out.print(array[i] + " ");
        }




    }
}
