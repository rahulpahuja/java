package com.rahul.pahuja.day2;

public class GenericPrint {
    public static void main(String[] args) {
        GenericPrint printer = new GenericPrint();
        printer.genericPrint(42);
        printer.genericPrint("Rahul");
    }

    <T> void genericPrint(T t) {
        System.out.println(t);
    }
}
