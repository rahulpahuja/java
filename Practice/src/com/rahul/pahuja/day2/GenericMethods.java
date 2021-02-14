package com.rahul.pahuja.day2;

public class GenericMethods {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        String rahul = "Rahul";
        String ram = "Ram";
        System.out.println("Before Swap");
        System.out.println(rahul + " , " + ram);
        genericMethods.swapString(rahul, ram);
        System.out.println("After Swap");
        System.out.println(rahul + " , " + ram);
    }

    public void swapString(String s1, String s2) {
        String s3 = s1;
        s1 = s2;
        s2 = s3;
    }


}
