package com.rahul;

public class GenericClassWithTwoParameters <T,V>{
    T obt;
    V obv;

    public GenericClassWithTwoParameters(T t, V v) {
        obt = t;
        obv = v;
    }


    public T getObt() {
        return obt;
    }

    public V getObv() {
        return obv;
    }

    public void showType(){
        System.out.println("Type of the First object is "+obt.getClass().getName());
        System.out.println("Type of the Second object is "+obv.getClass().getName());
    }
}
