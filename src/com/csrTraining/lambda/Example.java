package com.csrTraining.lambda;

@FunctionalInterface
public interface Example {
    public  void add(int num1,int num2);
    default void sub(){

    }
}
