package com.Array.exer1;

/**
 * ClassName: ArrayTest01
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 2023/11/28 21:06
 * @Version 1.0
 */
public class ArrayTest01 {
    public static void main(String[] args) {

        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++){
            yanghui[i] = new int[i+1];
            yanghui[i][0] = yanghui[i][i] = 1;
            for (int j = 1; j < yanghui[i].length -1 ; j++){  //  -1 是因为最有一个为1 不是上面相加的的结果 需要剔除
                if (i > 2) {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
            }
        }



        for (int i =0; i< yanghui.length; i++){
            for (int j = 0; j < yanghui[i].length ;j++){
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
