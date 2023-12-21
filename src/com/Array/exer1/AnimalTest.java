package com.Array.exer1;

/**
 * ClassName: AnimalTest
 * Package: com.Array
 * StarTime:2023/12/11 20:34
 *
 * @Author :aohongchang
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.name = "金昌";
        //ani.legs = 14;
        ani.eat();
        ani.setLeg(2);
        System.out.println("name = " + ani.name + ", legs = " + ani.getlegs());



    }






}

class Animal{
    String name ;
    private int legs;
    public void eat(){
        System.out.println("吃饭");
    }
    public int getlegs(){
        return legs;
    }


    public void setLeg(int l){
        if(l < 0){
            System.out.println("数据非法");
        }else {
            legs = l;
        }
    }


}