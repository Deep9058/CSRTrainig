package com.csrTraining.Exercises;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age + " years old";
    }


    @Override
    public int compare(Person o1, Person o2) {
        int age1=o1.age;
        int age2=o2.age;

        return Integer.compare(age1,age2);
    }
}
