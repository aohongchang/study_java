package com.Array.exer1;

import java.io.PrintStream;

/**
 * ClassName: Test
 * Package: com.Array
 * StarTime:2023/12/5 22:57
 *
 * @Author :aohongchang
 */
public class Test {


    public static void main(String[] args) {
        Test test = new Test();//没有这句 method方法就需要变成静态方法static
        int a = 10;
        int b = 10;

        test.method(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
    public  void method(int a, int b){
        PrintStream ps = new PrintStream(System.out){

            public void println(String x){
                if ("a=10".equals(x)){
                    x = "a=100";
                }else if("b=10".equals(x)){
                    x = "x=200";
                }
                super.println(x);
            }


        };
        System.setOut(ps);


    }


}

