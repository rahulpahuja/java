package com.rahul.pahuja.day2;

public class GenericStaticMethodDemo {

    static<T> void genericPrint(T t){
        System.out.println(t.getClass().getSimpleName()+":"+t);
    }

    public static void main(String[] args) {
        genericPrint(122);
        genericPrint("Rahul");
        genericPrint('c');
        genericPrint(2.1414f);
        genericPrint(true);
        genericPrint(1.7344444);
    }
}
