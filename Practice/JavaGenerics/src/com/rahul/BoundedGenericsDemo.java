package com.rahul;

public class BoundedGenericsDemo {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        BoundedGenerics<Integer> bg = new BoundedGenerics<Integer>(arr);
        System.out.println("Avg : "+bg.getAvg());

//        String[] arr1 = {"1","2","3","4","5","6","7","8","9","10"};
//        BoundedGenerics<String> bg1 = new BoundedGenerics<String>(arr1);
//        System.out.println("Avg : "+bg1.getAvg());

        Float[] arr2 = {11f,22f,33f,44f,55f,66f,77f,88f,99f,110f};
        BoundedGenerics<Float> bg2 = new BoundedGenerics<Float>(arr2);
        System.out.println("Avg : "+bg2.getAvg());

    }
}
