package com.rahul;

public class BoundedGenerics <T extends Number>{
    T[] nums;
    public BoundedGenerics(T[] numbers){
        nums = numbers;
    }

    public void printLength(){
        System.out.println(nums!=null?nums.length:-1);
    }

    Double getAvg(){
        Double sum = 0.0;
        if(nums==null||nums.length==0){
            return 0.0;
        }
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}
