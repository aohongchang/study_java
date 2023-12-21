package com.Array.exer1;

/**
 * ClassName: PassObject
 * Package: com.Array
 * StarTime:2023/12/5 21:51
 *
 * @Author :aohongchang
 */
public class PassObject {

    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle test = new Circle();
        obj.printAreas(test,5);


    }

    public void printAreas(Circle c, int time){

        for (int i=0 ;i <= time; i++){
            System.out.println("Radius\t\t\tArea");;
            c.radius = i;
            System.out.println(c.radius + "\t\t\t\t" + c.findArea());
        }

    }






}
