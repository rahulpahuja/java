package com.rahul.pahuja.day3;

 //Ex3.4
public class GenericArrayClass<T> {

    T t;

    public GenericArrayClass(T t) {
        this.t = t;
    }

    public void printData(){
        System.out.println(t);
    }

}

//Usage
class GenericTest{
    public static void main(String[] args) {
        GenericArrayClass<String> a = new GenericArrayClass<String>("Java");
        a.printData();

        GenericArrayClass<Integer> b = new GenericArrayClass<Integer>(123);
        b.printData();

        GenericArrayClass<Double> c = new GenericArrayClass<Double>(3.412);
        c.printData();
    }
}

