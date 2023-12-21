package constructor;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean flag = true;
        double banlance = 0.0;
        do {
            System.out.println("============ATM===========");
            System.out.println("1存款");
            System.out.println("2取款");
            System.out.println("3显示余额");
            System.out.println("4退出");
            System.out.print("输入您的操作1-4：");
            int math_id = scan.nextInt();
            switch (math_id){
                case 1:
                    System.out.print("请输入存款金额：");
                    double money1 = scan.nextDouble();
                    banlance += money1;
                    break;
                case 2:
                    System.out.print("请输入取款金额：");
                    double money2 = scan.nextDouble();
                    if (banlance >= money2 && money2 >=0){
                        banlance -= money2;
                    }else {
                        System.out.println("余额不足或输入数据有误。");
                    }
                    break;
                case 3:
                    System.out.println("余额为" + banlance);
                    break;
                case 4:
                    flag = false;
                    System.out.println("欢迎下次光临。");
                    break;
                default:
                    System.out.println("输入有误！");
                    break;
            }
        }while(flag);
    }

}
