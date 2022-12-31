package com.rahul.thread.synchronization.producerconsumer.synchronizedandfixed;

import com.rahul.thread.synchronization.producerconsumer.Q;

public class ProducerFixed implements Runnable {
    QFixed q;

    public ProducerFixed(QFixed q) {
        this.q = q;
        new Thread(this,"Producer").start();
    }


    @Override
    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
        }
    }
}
