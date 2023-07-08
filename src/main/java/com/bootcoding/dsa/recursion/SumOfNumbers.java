package com.bootcoding.dsa.recursion;

public class SumOfNumbers {
    //WAP to print sum of numbers from 1 to n using recursion...
    //create one method..
    public static int CalculateSum(int n){
        if(n == 0){
            return 0;
        }else{
            return n + CalculateSum(n-1);

        }
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = CalculateSum(n);
        System.out.println("The sum of numbers from 1 to " + n + " is: " +sum);
    }
}
