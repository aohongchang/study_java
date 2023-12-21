package com.Array.exer1;

/**
 * ClassName: ValueTreansferTest
 * Package: com.Array
 * StarTime:2023/12/4 22:33
 *
 * @Author :aohongchang
 */
public  class ValueTreansferTest {
    public static  void main(String[] args) {
        ValueTreansferTest test = new ValueTreansferTest();

        Data data = new Data();
        data.m=10;
        data.n = 20;

        test.swap(data);
        System.out.println(" m = " + data.m + ", n = " + data.n);
    }

//交换
    public void swap(Data data){
        int temp = data.n;
        data.n =data.m;
        data.m = temp;

    }

    //数据类

}
class Data{
    int m;
    int n;
}

