package com.Array.exer1;
//f(20)=1,f(21)=4,f(n+2) = f*f(n+1) + f(n)
public class RecusionExer01 {

    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;

        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }

}
