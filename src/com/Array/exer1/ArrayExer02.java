package com.Array.exer1;

/**
 * ClassName: ArrayExer02
 * Package: com.Array
 * StarTime:2023/11/28 23:17
 * 删除数组元素
 * @Author :aohongchang
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int deleterIndex = 4;
        //不新建
        for (int i = deleterIndex; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("==================");

       // 方式2： 新建数组，新建数组的长度比原有数组长度少1
        int[]  NewArray = new int[arr.length-1];
        for (int i = 0; i < deleterIndex ; i++){
            NewArray[i] = arr[i];
        }
        for (int i = deleterIndex; i<arr.length - 1 ;i++){
            NewArray[i] = arr[i+1];
        }
        arr = NewArray;

        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();






    }
}
