package com.Array.exer1;


/**
 * ClassName: StringConcatTest
 * Package: com.Array
 * StarTime:2023/12/3 19:46
 *
 * @Author :aohongchang
 */
public class StringConcatTest {


    public static void main(String[] args) {
        StringConcatTest test = new StringConcatTest();
        String info = test.concat("-","hello","world");
        System.out.println(info);

    }


    public String concat(String operator, String ... strs){
        String result = "";
        for (int i = 0; i < strs.length; i++){
            if (i == 0){
                result += strs[i];
            }else {
                result += (operator + strs[i]);
            }
        }


        return result;


    }


}
