package com.bootcoding.dsa.recursion;

public class MinEleOfArr_Recursion {
    public static void main(String[] args) {
        int arr[] = {13,11,14,9,15};
        int min = arr[0];
        int i = 0;
        int index = min(arr, min, i);
        System.out.println(index);
    }
    public static int min(int[]a, int min, int i){
        if(i == a.length-1){
            return min;
        }

        if(min>a[i]){
           min = a[i];
        }

        return min(a,min,++i);

       /* int x = 0;
        int y = 0;
        Math.min(x,y);
        min = Math.min(min,a[i]);
        return min(a,min,++i);
        */

    }
}
