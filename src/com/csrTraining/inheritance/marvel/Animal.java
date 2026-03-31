package com.csrTraining.inheritance.marvel;

public class Animal {

    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat()
    {
        System.out.println("Animal is eating.");
    }

    static void main() {
        Animal anm= new Animal();
        anm.eat();
        anm.setName("Animal");
        System.out.println( anm.getName());

    }
}
