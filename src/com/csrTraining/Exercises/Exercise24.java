package com.csrTraining.Exercises;

public class Exercise24 {

    public static String isRaining(boolean raining) {

        if (!raining)
        {
            System.out.println("I'll go for a walk.");
        }
        else
            System.out.println("I guess it's another day for indoor activities!");

        return "";
    }

    static void main() {

        isRaining(true);
    }
}