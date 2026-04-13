package com.csrTraining.Exercises;

import java.util.ArrayList;
import java.util.List;

public class PersonsAgeSorting {

    public static void main(String[] args) {
        List<Person> sortedList = sortPersonsUsingAge();
        sortedList.forEach(System.out::println);
    }

    public static List<Person> sortPersonsUsingAge() {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("James", 65));
        persons.add(new Person("Sneha", 34));
        persons.add(new Person("Jenna", 30));
        persons.add(new Person("Harry", 29));


        persons.sort((o1, o2) -> Integer.compare(o1.age, o2.age));

        return persons;
    }
}