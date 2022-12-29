package com.rahul.thread.basics;
//Thread Demo By Using Runnable Implementation
public class NewThread implements Runnable{
    private Thread t;

    NewThread(){
        t = new Thread(this,"Demo Thread");
        System.out.println("Child Thread : "+t);
        t.start();//This will inturn hit the run in the current thread
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <5 ; i++) {
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Interrupted");

        }
        System.out.println("Exiting Child Thread");

    }
}
