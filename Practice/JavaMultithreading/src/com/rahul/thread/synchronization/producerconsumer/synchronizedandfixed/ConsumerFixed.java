package com.rahul.thread.synchronization.producerconsumer.synchronizedandfixed;

import com.rahul.thread.synchronization.producerconsumer.Q;

public class ConsumerFixed implements Runnable {
    QFixed q;

    public ConsumerFixed(QFixed q) {
        this.q = q;
        new Thread(this,"ConsumerFixed").start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
