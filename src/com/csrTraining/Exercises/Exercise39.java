package com.csrTraining.Exercises;

import java.util.LinkedList;

public class Exercise39 {

    public static LinkedList<String> foodNames() {

        LinkedList <String> names= new LinkedList<>();
        names.add("Pizza");
        names.add("Burger");
        names.add("Salad");
        names.add("Noodles");
        names.add("Rice");
        System.out.println(names);

        return names;
    }

    static void main() {
        foodNames();
    }

}