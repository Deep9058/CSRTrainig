package com.csrTraining.inheritance.marvel;

public class Vehical {

    int horsepower;
    String color;
    double turningRadius;
    String madeFor;

    public Vehical() {
        System.out.println("Vehical constructor");
        horsepower=120;
        color="Red";
        turningRadius=7.34;
        madeFor="Road";

    }

    public  String start()
    {
        System.out.println("Vehical started");
        return "";
    }

    static void main() {
        Vehical vehical= new Vehical();
        System.out.println(vehical.start());
    }
}
