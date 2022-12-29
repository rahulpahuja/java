package com.rahul.thread.synchronization;

public class CallMeWithSync {
    synchronized void call (String msg){
        System.out.println("["+msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception");
        }
        System.out.print("]");
    }
}
