package constructor;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("输入身高：");
        int height = scan.nextInt();
        System.out.print("输入财富:");
        double money = scan.nextDouble();
        System.out.print("帅 or 丑(true or false):");
        boolean isNotperty = scan.nextBoolean();

        if (height >= 180 && money >= 10000000 && isNotperty){
            System.out.println("我一定要嫁给他！！！");
        }else if (height >= 180 || money >= 10000000 || isNotperty){
            System.out.println("嫁吧，比上不足比下有余。");
        }else {
            System.out.println("不嫁");
        }





    }



}
