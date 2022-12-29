package com.rahul.thread.synchronization;

public class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
//        Caller ob1 = new Caller(target,"Hello");
//        Caller ob2 = new Caller(target,"Synchronized");
//        Caller ob3 = new Caller(target,"World");

        CallMeWithSync target1 = new CallMeWithSync();
        Caller sob1 = new Caller(target1,"Hello");
        Caller sob2 = new Caller(target1,"Synchronized");
        Caller sob3 = new Caller(target1,"World");


//        try {
//            ob1.t.join();
//            ob2.t.join();
//            ob3.t.join();
//        }catch (InterruptedException e){
//            System.out.println("Interrupted");
//        }

        //System.out.println("The above had Race Condition");

        try {
            sob1.t.join();
            sob2.t.join();
            sob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
