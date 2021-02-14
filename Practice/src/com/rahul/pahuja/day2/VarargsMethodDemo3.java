package com.rahul.pahuja.day2;

public class VarargsMethodDemo3 {
    static void varargsMethod3(Object... objects) {
        System.out.println("Number of Elements " + objects.length);
        for (Object o : objects) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varargsMethod3(1, 2, "true", true);
        varargsMethod3();
        varargsMethod3(22);
    }
}
