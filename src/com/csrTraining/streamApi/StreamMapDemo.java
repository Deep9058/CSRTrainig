package com.csrTraining.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMapDemo {
    static void main(String[] args) {
//        List<String> list=new ArrayList<>();
//        list.add("Sales");
//        list.add("Development");
//        list.add("Testing");
//        list.add("Deployment");
//        list.add("Management");
//        list.add("Marketing");
//
//        list.stream().map(word->word.toUpperCase()).forEach(System.out::println);

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);
        list.stream().distinct().map(var->var+var-2).forEach(System.out::println);


    }
}
