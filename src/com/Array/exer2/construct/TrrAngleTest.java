package com.Array.exer2.construct;

/**
 * ClassName: TrrAngleTest
 * Package: com.Array.exer2.construct
 * StarTime:2023/12/19 21:38
 *
 * @Author :aohongchang
 */
public class TrrAngleTest {
    public static void main(String[] args) {
        TrrAngle trr = new TrrAngle();
        trr.setBase(2.3);
        trr.setHeight(23.2);
        System.out.println(trr.findArea());

        TrrAngle t2 = new TrrAngle(2.3,23.2);
        System.out.println(t2.findArea());


    }




}
