package com.csrTraining.inheritance.marvel;

public class SpiderMan extends SuperHero {
    public void usePower()
    {

        System.out.println("SpiderMan is Flying using SpiderWeb.");
    }
    public void eat(String food) // Method OverRiding //
    {
        System.out.println("SpiderMan is eating "+ food);
    }
}
