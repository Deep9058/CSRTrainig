package com.csrTraining.multiThreading;

public class DeadlockDemo {
    public static final String R1="Hello";
    public static final String R2="Hii";
    static void main(String[] args) {
        Thread thread1 = new Thread(()-> {
            synchronized (R1) {
                System.out.println("Thread1 locked: Resource R1");
                synchronized (R2) {
                      System.out.println("Thread1 locked: Resource R2");
                }
            }
        });
        Thread thread2 = new Thread(()-> {

            synchronized (R2) {
                System.out.println("Thread2 locked: Resource R2");
                synchronized (R1) {
                    System.out.println("Thread2 locked: Resource R1");
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}
