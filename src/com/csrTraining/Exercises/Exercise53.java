package com.csrTraining.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Exercise53 {

    public static List<Integer> transformStringLengths(List<String> strings) {

        List<Integer> result = new ArrayList<>();
        Function<String, Integer> lengthFunction = (str) -> str.length();



        for (String str : strings) {
            result.add(lengthFunction.apply(str));
        }

        return result;

    }

    static void main(String[] args) {
        List<String> input = List.of("hello", "world", "java", "lambda");
        System.out.println(transformStringLengths(input));
    }

}