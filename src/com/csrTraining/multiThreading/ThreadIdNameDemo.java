package com.csrTraining.multiThreading;

public class ThreadIdNameDemo {
    static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        t3.setName("MyThread");

        Long t1ID=t1.getId();
        Long t2ID=t2.getId();
        Long t3ID= t3.getId();
        String t1Name=t1.getName();
        String t2Name=t2.getName();
        String t3Name= t3.getName();
        System.out.println("Thread1 ID is "+ t1ID +" and name is: "+ t1Name);
        System.out.println("Thread2 ID is "+ t2ID +" and name is: "+ t2Name);
        System.out.println("Thread3 ID is "+ t3ID +" and name is: "+ t3Name);
    }
}
