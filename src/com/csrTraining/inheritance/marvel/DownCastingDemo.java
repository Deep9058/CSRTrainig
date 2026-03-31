package com.csrTraining.inheritance.marvel;

public class DownCastingDemo {
    public static void main() {
        Animal anm;
        Dog dog = new Dog();
        anm=dog; // UpCasting   //

        dog = (Dog)anm;
        dog.setName("Blackyy");
        System.out.println(dog.getName());
        dog.eat();

    }
}
