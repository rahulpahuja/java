package com.rahul.pahuja.day2;

import java.util.ArrayList;
import java.util.List;

public class GenericPrint {
    public static void main(String[] args) {
        GenericPrint printer = new GenericPrint();
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(42);
        objects.add(43);
        objects.add(432);
        printer.genericPrint(objects);
        printer.genericPrint("Rahul");
    }

    <T> void genericPrint(T t) {
        System.out.println(t);

    }

    <T> void genericPrint(List<T> t) {
        System.out.println(t);
    }
}
