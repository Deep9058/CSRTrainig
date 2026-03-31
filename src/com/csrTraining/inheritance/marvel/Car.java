package com.csrTraining.inheritance.marvel;

public class Car extends Vehical{
    int horsepower;
    String color;
    double turningRadius;
    boolean isAutomatic;

    public Car()
    {
        System.out.println("Car constructor");
        horsepower=180;
        color="white";
        turningRadius=5.32;
        isAutomatic=true;
    }

    public String start()
    {
        System.out.println("Car Started.");
        return "";
    }

    void printinfo() {
        Car car= new Car();
        car.start();
        System.out.println(car.color);
        System.out.println(super.color);

    }

    static void main() {
        Car car= new Car();
        car.printinfo();
    }

}
