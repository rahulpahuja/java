package com.rahul.pahuja.day2;

public class VarargsMethodDemo2 {
    static void varargsMethod2(int... v) {
        System.out.println("Number of Elements " + v.length);
        for (int x : v
        ) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varargsMethod2(2, 3, 4, 5, 6, 7, 8, 9, 10);
        varargsMethod2(2, 3, 4, 5, 6, 7, 8);
        varargsMethod2(2, 3, 4, 5, 6, 7, 8, 999);
        varargsMethod2();

    }
}
