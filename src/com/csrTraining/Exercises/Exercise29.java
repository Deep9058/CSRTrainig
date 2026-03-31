package com.csrTraining.Exercises;

public class Exercise29 {

    public static long calculateFactorial(int n) {
        long factorial = 1;
        int i=1;

        do {
            factorial=factorial*i;
            i++;

        }while(i<n+1);

        System.out.println(factorial);
        return factorial;
    }

    static void main() {
        calculateFactorial(6);
    }

}