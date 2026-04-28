package com.csrTraining.multiThreading;

public class ThreadDemo {

    static void main(String[] args) {
        Thread thread= new Thread();
        thread.start();

        Thread thread1= new Thread(()-> System.out.println("Hello from Java Thread. "));
        thread1.start();

        Runnable runnable= ()-> System.out.println("Hello from Runnable Interface.");
        Thread thread2 = new Thread(runnable);
        thread2.start();
        System.out.println("Hello from Main Thread. ");
    }


}
