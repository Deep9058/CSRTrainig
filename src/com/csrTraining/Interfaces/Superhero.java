package com.csrTraining.Interfaces;

public interface Superhero {
    String usePower();
    String stopVillan(String c);
    default void perfromAddition(int a, int b)
    {
        int sum=a+b;
        System.out.println("Addition of two numbers is  "+ sum);

    }

}
