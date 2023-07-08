package com.bootcoding.dsa.recursion;

public class AscendingOrder {
    public static void main(String[] args) {
        int n = 10;
        odd(n);
    }
    public static void odd(int n){
        if(n == 0){
            return;
        }
        odd(n-1);
        if(n % 2 != 0) {
            System.out.println("odd number: " +n);
        }


    }
}
