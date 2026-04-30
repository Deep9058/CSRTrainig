package com.csrTraining.multiThreading;

public class PriorityExample implements Runnable {

    private final String name;

    public PriorityExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (long i=0;i<5;i++) {
            System.out.println(name +"--count: "+ i+" Priority: "+ Thread.currentThread().getPriority());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
