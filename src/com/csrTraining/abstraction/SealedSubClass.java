package com.csrTraining.abstraction;

public non-sealed class SealedSubClass extends SealedSuperClass {

    @Override
    public void display() {
        System.out.println("hello");
        System.out.println("kese ho");
    }

    static void main() {
        SealedSubClass abc= new SealedSubClass();
        abc.display();
    }
}



