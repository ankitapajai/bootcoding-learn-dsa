package com.bootcoding.dsa.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 13;
        int result = fib(n);
        System.out.println(result);

    }
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
