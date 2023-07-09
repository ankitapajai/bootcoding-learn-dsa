package com.bootcoding.dsa.recursion;

public class CountOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int result = count(num);
        System.out.println(result);
    }

    public static int count(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + count(num / 10);
    }

}
