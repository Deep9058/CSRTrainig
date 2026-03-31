package com.csrTraining.Exercises;

public class Exercise5 {
    public static void main (String[] args) {

        int overflowNum;

        overflowNum= Integer.MAX_VALUE;
        overflowNum= ++overflowNum;
        System.out.println(overflowNum);

    }
}
