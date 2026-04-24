package com.csrTraining.Exercises;

import java.util.List;
import java.util.function.Consumer;

public class Exercise55 {

    public static void convertAndPrint(List<String> inputString) {


        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());

        for (String str : inputString) {
            consumer.accept(str);
        }
    }

    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "carrot");
        convertAndPrint(list);
    }
}