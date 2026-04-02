package com.csrTraining.inheritance.marvel;

public class UpcastingDemo {
    static void main() {
        Animal anm= new Animal();
        anm.setName("Blackyy");
        AnimalUtility.printName(anm);

        anm= new Dog();         // UpCasting    //
        anm.setName("charlie");
        AnimalUtility.printName(anm);

        Cat cat= new Cat();
        cat.setName("cattyyy");
        AnimalUtility.printName(cat);



    }
}
