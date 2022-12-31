package com.rahul.thread.synchronization.producerconsumer.synchronizedandfixed;

public class QFixed {
    int n;
    boolean valueSet = true;
    synchronized int get(){
        while (!valueSet)
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got:"+n);
        valueSet = false;
        notify();
        return n;
    }

    public synchronized void put(int n){
        try{
            wait();
        }catch (InterruptedException e){
            System.out.println("InterruptedException caught");
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put:"+n);
        notify();
    }
}
