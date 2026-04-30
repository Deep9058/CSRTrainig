package com.csrTraining.multiThreading;

public class ThreadPriorityDemo {
    static void main(String[] args) {
        Thread thread1= new Thread(new PriorityExample("Thread A"));
        Thread thread2= new Thread(new PriorityExample("Thread B"));
        Thread thread3= new Thread(new PriorityExample("Thread C"));
        Thread thread4= new Thread(new PriorityExample("Thread D"));

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
