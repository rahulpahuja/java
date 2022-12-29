package com.rahul.thread.basics;

//CurrentThreadDemo
public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread t = Thread.currentThread();

        System.out.println("Current thread: "+t);//[ThreadName,Priority,ThreadGroup]

        t.setName("Rahul's Thread");

        System.out.println("After name change :"+t);

        try{
            for (int i = 5; i >0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
                throw new InterruptedException("Interrrrrupt");
            }
        }catch(InterruptedException e){
            System.out.println("Message: "+e.getMessage());
            System.out.println("Cause: "+e.getCause());
            System.out.println("Rahul's Thread Interrupted");
        }
    }
}
