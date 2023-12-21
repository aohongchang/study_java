package com.Array.exer1;

/**
 * ClassName: ArrayTest02
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 2023/11/28 21:42
 * @Version 1.0
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int i = 0 ; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        array2 = array1;
        for (int i = 0 ; i < array2.length; i++){
            if ( i % 2 == 0){
                array2[i] = i;
            }
        }
        for (int i = 0 ; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println(array1);
        System.out.println(array2);
        //array1  array2 是同一个地址 ，说明同于给数组
    }
}
