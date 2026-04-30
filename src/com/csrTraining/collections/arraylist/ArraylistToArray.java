package com.csrTraining.collections.arraylist;

import com.csrTraining.Exercises.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistToArray {
    static void main() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("James", 65));
        persons.add(new Person("Sneha", 34));
        persons.add(new Person("Jenna", 30));
        persons.add(new Person("Harry", 29));

        Person[] arrayy= persons.toArray(new Person[0]);
        System.out.println(Arrays.toString(arrayy));

        List<Person> newarr= Arrays.asList(arrayy);
        System.out.println(newarr);
    }
}
