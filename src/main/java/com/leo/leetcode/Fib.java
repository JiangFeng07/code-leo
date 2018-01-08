package com.leo.leetcode;

/**
 * Created by lionel on 18/1/7.
 */
public class Fib {
    public static int Fibonacci(int n) {
        if(n>39){
            return 0;
        }
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int f1=0;
        int f2=1;
        int fn=0;
        while(n>2){
            fn=f1+f2;
            f1=f2;
            f2=fn;
            n--;
        }
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
}
