package com.rahul.thread.synchronization.producerconsumer.synchronizedandfixed;


import com.rahul.thread.synchronization.producerconsumer.Consumer;
import com.rahul.thread.synchronization.producerconsumer.Producer;

public class PCFixed {
    public static void main(String[] args) {
        QFixed q = new QFixed();
        new ProducerFixed(q);
        new ConsumerFixed(q);
        System.out.println("Press Control-C to stop.");
    }
}
