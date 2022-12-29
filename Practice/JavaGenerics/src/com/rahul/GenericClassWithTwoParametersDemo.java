package com.rahul;

public class GenericClassWithTwoParametersDemo {
    public static void main(String[] args) {
        GenericClassWithTwoParameters<Integer , String> ob1 = new GenericClassWithTwoParameters<>(1,"Rahul");
        GenericClassWithTwoParameters<Integer , String> ob2 = new GenericClassWithTwoParameters<>(2,"Ram");

        System.out.println("Ob1 T:"+ob1.getObt());
        System.out.println("Ob1 V:"+ob1.getObv());

        System.out.println("Ob2 T:"+ob2.getObt());
        System.out.println("Ob2 V:"+ob2.getObv());


        ob1.showType();
        ob2.showType();
    }
}
