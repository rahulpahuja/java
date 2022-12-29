package com.rahul.thread.extension;

public class ExtendThreadDemo {
    public static void main(String[] args) {
        new ExtendingThread();
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
