package com.csrTraining.multiThreading;

public class SleepDemo {
    static void main(String[] args) throws InterruptedException {
        long result=0;
        long start=System.currentTimeMillis();
        for (int i=0;i<5;i++) {
            System.out.println("Hello from main method "+ i);
            Thread.sleep(10);
        }

        long end=System.currentTimeMillis();
        System.out.println("Total time:"+(end-start)+"ms");
    }
}
