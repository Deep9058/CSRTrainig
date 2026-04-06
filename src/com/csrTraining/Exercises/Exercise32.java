package com.csrTraining.Exercises;

public class Exercise32 {

    public static String[] storeStringsInArray() {

        String[] name={"Woof!", "Meow!", "Quack!"};
        System.out.println(name.length);
        for(String names : name){

            System.out.print(names + " ");
        }

        return name;
    }

    static void main() {
        storeStringsInArray();
    }

}
