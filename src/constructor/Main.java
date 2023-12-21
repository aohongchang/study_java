package constructor;//导包
//scanner类中提供了获取除了char类型的方法

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //创建一个scanner类的实例
        Scanner scan = new Scanner(System.in);


        System.out.print("年龄：");
        int age = scan.nextInt();
        System.out.print("体重：");
        double weight = scan.nextDouble();
        System.out.print("是否单身：（单身true，不单身false）：");
        boolean isSingle = scan.nextBoolean();
        String temp;
        if(isSingle){
              temp = "男";
        }else {
             temp = "女";
        }
        System.out.print("男/女");
        char gender = scan.next().charAt(0);

        System.out.println("年龄=" +age+ "，体重=" + weight +"，是否单身="+ temp +"，性别="+ gender);

        scan.close();





    }



}

