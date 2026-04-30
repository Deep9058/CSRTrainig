package com.csrTraining.multiThreading;

public class JoinExapmle {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(
                ()->{
                    for (long i=0;i<5;i++) {
                        System.out.println("Thread A count: "+ i);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
        threadA.start();
        threadA.join();
        System.out.println("Main thread ended. ");
    }
}
