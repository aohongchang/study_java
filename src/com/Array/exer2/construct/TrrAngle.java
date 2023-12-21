package com.Array.exer2.construct;

/**
 * ClassName: TrrAngle
 * Package: com.Array.exer2.construct
 * StarTime:2023/12/19 21:29
 *
 * @Author :aohongchang
 */
public class TrrAngle {
    private double base;
    private double height;


    public double getBase(){
        return base;
    }

    public void setBase(double b){
        base = b;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height = h;
    }

    public TrrAngle(){

    }

    public TrrAngle(double b, double h){
        base = b;
        height = h;
    }

    public double findArea(){
        return base*height/2;
    }



}
