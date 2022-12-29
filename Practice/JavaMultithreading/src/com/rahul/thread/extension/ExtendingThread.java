package com.rahul.thread.extension;

public class ExtendingThread extends Thread {
    private Thread t;

    ExtendingThread(){
        t = new Thread(this,"Demo Thread");
        System.out.println("Child Thread : "+t);
        start();//This will inturn hit the run in the current thread, and start it
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
