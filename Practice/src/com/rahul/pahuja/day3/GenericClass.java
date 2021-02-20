package com.rahul.pahuja.day3;

//Ex3.4
class D3GenericClass<T> {

    T t;

    public D3GenericClass(T t) {
        this.t = t;
    }

    public void printData(){
        System.out.println(t);
    }

}

//Usage
class GenericTestDemo{
    public static void main(String[] args) {
        D3GenericClass<String> a = new D3GenericClass<String>("Java");
        a.printData();

        D3GenericClass<Integer> b = new D3GenericClass<Integer>(123);
        b.printData();

        D3GenericClass<Double> c = new D3GenericClass<Double>(3.412);
        c.printData();
    }
}
