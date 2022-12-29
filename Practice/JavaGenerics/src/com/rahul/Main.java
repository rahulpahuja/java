package com.rahul;
//Page 338 Java Complete Ref 9th edition
public class Main {

    static class Gen<T>{
        T ob;

        Gen(T o){
            ob =o;
        }

        public T getOb() {
            return ob;
        }

        public void showType(){
            System.out.println("Type of T i s"+ob.getClass().getName());
        }
    }

    public static void main(String[] args) {
	// write your code here
        Gen<Integer> iob;

        iob = new Gen<Integer>(88);

        iob.showType();

        int v = iob.getOb();
        System.out.println("Value v is "+v);

        Gen<String> strOb = new Gen<>("This is a String");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Value of String str is "+str);
    }
}
