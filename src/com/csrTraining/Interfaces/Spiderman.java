package com.csrTraining.Interfaces;

public class Spiderman implements Superhero,Hero{
    @Override
    public String usePower() {
        System.out.println("Spiderman using his web.");
        return "";
    }

    @Override
    public String stopVillan(String c) {
        System.out.println("Spiderman kill " + c + ".");
        return "";
    }

    @Override
    public String walk() {
        System.out.println("spiderman in walking.");
        return "";
    }

    @Override
    public String fight() {
        System.out.println("spiderman in fighting.");
        return "";
    }

    static void main() {
        Spiderman spd= new Spiderman();
        spd.usePower();
        spd.stopVillan("Raka");
        spd.walk();
        spd.fight();
        spd.talk();
        spd.perfromAddition(5,9);
    }
}
