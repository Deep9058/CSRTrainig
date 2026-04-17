package com.csrTraining.generics;

public class NonGenericDemo {
    static void main() {
        Pair stringIntPair= new Pair("Deep",23);
        String name=(String) stringIntPair.getFirst();
        int age=(Integer) stringIntPair.getSecond();
        System.out.println(name);
        System.out.println(age);

    }
}
