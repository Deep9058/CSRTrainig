package com.csrTraining.Exercises;

public class Exercise30 {


    public static long sumOfNumbers(int number) {
        long sum = 0;
        for (int i=0;i<number;i++)
        {
            sum= sum+i;
            sum++;
        }

        System.out.println(sum);
        return sum;
    }

    static void main() {
        sumOfNumbers(100);
    }
}