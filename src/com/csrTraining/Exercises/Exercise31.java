package com.csrTraining.Exercises;

public class Exercise31 {

    static int i=1;


    public static int findDivisibleNumber(int num1, int num2) {

        while(true)
        {
            if (i%num1==0 && i%num2==0)
            {
                break;
            }
            i++;

        }

        System.out.println(i);
        return i;
    }

    static void main() {
        findDivisibleNumber(2,6);
    }

}
