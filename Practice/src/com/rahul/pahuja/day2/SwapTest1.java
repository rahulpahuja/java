package com.rahul.pahuja.day2;

public class SwapTest1 {
    public static <T> void genericSwap(T x, T y) {
        T temp;
        temp = x;
        x = y;
        y = temp;
    }

    //FIXME:Not working
    public static void main(String[] args) {
        Integer x = 2;
        Integer y = 9;

        System.out.println("x:" + x + " and y:" + y);
        genericSwap(x, y);
        System.out.println("x:" + x + " and y:" + y);


        String a = "A";
        String b = "B";
        System.out.println("a:" + a + " and b:" + b);
        genericSwap(a, b);
        System.out.println("a:" + a + " and b:" + b);
    }
}
