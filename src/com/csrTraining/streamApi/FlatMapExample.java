package com.csrTraining.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    static void main(String[] args) {
        List<Person> persons= Arrays.asList(new Person("Ayush", Arrays.asList("9548556023","8954185257")),
                new Person("Deep", Arrays.asList("8455720057","7078397320")));
        List<List<String >> mapResult =persons.stream().map(person -> person.getPhone_no()).collect(Collectors.toList());
        System.out.println("Using Map: "+ mapResult);

        List<String> flatMapResult =persons.stream().flatMap(person -> person.getPhone_no().stream()).collect(Collectors.toList());
        System.out.println("Using FlatMap: "+ flatMapResult);

    }
}
