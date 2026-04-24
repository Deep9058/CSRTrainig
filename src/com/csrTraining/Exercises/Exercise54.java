package com.csrTraining.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Exercise54 {

    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {


        UnaryOperator<Integer> increment = num -> num + incrementValue;
        List<Integer> result = new ArrayList<>();

        for (Integer num : numbers) {
            result.add(increment.apply(num));
        }

        return result;
    }


    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(incrementList(list, 3));
    }
}