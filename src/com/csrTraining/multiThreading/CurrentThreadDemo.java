package com.csrTraining.multiThreading;

public class CurrentThreadDemo {
    static void main(String[] args) {
        Thread mainThread =  Thread.currentThread();
        System.out.println("main thread ID:"+mainThread.getId());
        System.out.println("main thread name:"+mainThread.getName());
    }
}
