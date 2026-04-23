package com.csrTraining.Exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise51 {
    public static List<String> transformStringList() {

        List<String> words = List.of("hello", "world", "java", "lambda");
        List<String> result = new ArrayList<>();
        StringTransformer transformer = str -> str.toUpperCase();

        for (String word : words) {
            result.add(transformer.transform(word));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(transformStringList());
    }
}
