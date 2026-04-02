package com.csrTraining.Interfaces;

@FunctionalInterface
interface functioninterface {
    int addition(int a, int b);

    default String learning() {
        System.out.println("Default Method of FunctionalInterfaceDemo.");
        return "";
    }
}
public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Lambda expression to add two numbers
        functioninterface add = (a, b) -> a + b;        // lamba expressions;   //

        int result = add.addition(10, 20);
        System.out.println("Sum: " + result);
    }
}

