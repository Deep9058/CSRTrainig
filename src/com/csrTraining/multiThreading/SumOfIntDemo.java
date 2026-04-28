package com.csrTraining.multiThreading;

public class SumOfIntDemo {
    static void main(String[] args) {
        long result=0;
        long startTime= System.currentTimeMillis();
        for (long i=0;i<=Integer.MAX_VALUE;i++)
        {
            result=result+i;

        }
        System.out.println(result);
        long endTime= System.currentTimeMillis();
        System.out.println("Total time taken by Normal java class is: "+ (endTime-startTime));
    }
}
