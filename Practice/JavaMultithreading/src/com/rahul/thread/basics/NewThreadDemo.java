package com.rahul.thread.basics;

public class NewThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 0; i <5 ; i++) {
                System.out.println("Main Thread : "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");

        }
        System.out.println("Exiting Main Thread");
    }
}
