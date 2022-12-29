package com.rahul.thread.synchronization;

public class Synch {
    public static void main(String[] args) {
        System.out.println("-----Execution Begins w/o Synchronization----");
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target,"Hello");
        Caller ob2 = new Caller(target,"Synchronized");
        Caller ob3 = new Caller(target,"World");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }

        System.out.println("The above had Race Condition,Where Output can change on Each Run");
        System.out.println("-----Execution End w/o Synchronization----");

        System.out.println("-----Execution Begins with Synchronization----");
        System.out.println("The Below Code Avoids Race Condition by the Use of Synchronized Method");
        CallMeWithSync target1 = new CallMeWithSync();
        Caller sob1 = new Caller(target1,"Hello");
        Caller sob2 = new Caller(target1,"Synchronized");
        Caller sob3 = new Caller(target1,"World");

        try {
            sob1.t.join();
            sob2.t.join();
            sob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("-----Execution End with Synchronization----");
    }
}
