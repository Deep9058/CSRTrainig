package com.csrTraining.lambda.predefineMethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    static void main(String[] args) {
        Consumer<String> consumer= (input)-> System.out.println(input.toUpperCase());
        consumer.accept("Hello KEse Ho");

        Consumer<Integer> squareOf=(num)-> System.out.print(num*num + " ");
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        list.forEach(squareOf);
    }
}
