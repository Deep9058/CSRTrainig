package com.csrTraining.polymorphism;

public class FirstClass {
    int a,b,c;
    static void main() {
        FirstClass cl= new FirstClass();
        cl.add(4,5);
        cl.add(6,7,9);
    }
    public int add(int a,int b) {

        int sum = a+b;
        System.out.println(sum);
        return sum;

    }

    public int add(int a,int b,int c) {

        int sum = a+b+c;
        System.out.println(sum);  //    Method overloading  //
        return sum;

    }

    public  String walk() {
        System.out.println("Person is walking");

        return "";
    }


}
