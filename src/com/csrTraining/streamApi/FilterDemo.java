package com.csrTraining.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {
    static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Sales");
        list.add("Development");
        list.add("Testing");
        list.add("Deployment");
        list.add("Management");
        list.add("Marketing");
        list.stream()
                .map(word->word.toUpperCase())          //      map() method     //
                .filter(word->word.startsWith("M"))     //      filter() method     //
                .forEach(System.out::println);                //      forEach() Loop     //

    }
}
