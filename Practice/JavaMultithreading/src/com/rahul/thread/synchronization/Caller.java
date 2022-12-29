package com.rahul.thread.synchronization;

public class Caller implements Runnable   {
    private  CallMeWithSync target1;
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe obj,String msg){
        target = obj;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    public Caller(CallMeWithSync obj,String msg){
        target1 = obj;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {
        if(target1!=null && target1 instanceof  CallMeWithSync){
            target1.call(msg);
        }else
        target.call(msg);
    }
}
