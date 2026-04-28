package com.csrTraining.multiThreading;

import com.csrTraining.lambda.Hello;

public class MultiThreadDemo {
    static void main(String[] args) {
        Thread thread= new Thread();
        thread.start();

        Thread thread1= new Thread(()-> System.out.println("Hello from Java Thread"));
        thread1.start();

        Runnable runnable= ()-> System.out.println("Hello from Runnable interface");
        Thread thread2 = new Thread(runnable);
        thread2.start();

    }
}
