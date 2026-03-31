package com.csrTraining.polymorphism;

public class OverridingClass extends FirstClass{
    static void main() {

        OverridingClass oc= new OverridingClass();
        oc.walk();

    }

    public  String walk() {   //  Overriding  //
        System.out.println("We have to Walk.");
        return null;
    }

}
