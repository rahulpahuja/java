package com.rahul.pahuja.day2;

public class VarargsMethodDemo1 {
    static void varargsMethod1(int[] v) {
        System.out.println("Number of args: " + v.length + " Elements: ");
        for (int x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //following arrays are created for test
        int[] x = {1, 3, 5, 7, 9, 11};
        int[] y = {2, 4, 6, 8, 10, 12, 14};
        int[] z = {1, 11, 111, 1111, 11111, 111111, 1111111, 11111111};
        varargsMethod1(x);
        varargsMethod1(y);
        varargsMethod1(z);
    }
}
