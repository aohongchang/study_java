package constructor;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int)(Math.random()*100 ) + 1;
        System.out.print("请输入一个1~100整数：");
        int guess = scan.nextInt();

        while (random != guess){
            if (random < guess){
                System.out.println("你输入的数字太大！");
            }else {
                System.out.println("你输入的数字太小！");
            }
            System.out.print("不正确！请再次输入一个1~100的数字:");
            guess = scan.nextInt();
        }
        System.out.println("输入正确！！！");

    }
}
