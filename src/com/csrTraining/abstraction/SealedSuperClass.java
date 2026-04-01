package com.csrTraining.abstraction;

public sealed class SealedSuperClass permits SealedSubClass,Employee{

    public void display()
    {
        System.out.println("Hello");
    }
    static void main() {
        SealedSuperClass cls= new SealedSuperClass();
        cls.display();
    }
}
