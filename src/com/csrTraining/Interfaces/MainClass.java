package com.csrTraining.Interfaces;

public class MainClass extends New implements Hero {

    @Override
    public String walk() {
        return "";
    }

    @Override
    public String fight() {
        return "";
    }

     public static void main() {
        MainClass cls= new MainClass();
        cls.talk();

    }
}
