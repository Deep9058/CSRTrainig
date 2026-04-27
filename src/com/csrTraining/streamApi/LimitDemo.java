package com.csrTraining.streamApi;

import java.util.Random;
import java.util.stream.Stream;

public class LimitDemo {
    static void main(String[] args) {
        Stream.generate(new Random()::nextInt)
                .limit(10)                  //      limit() method-> limit to pass values or element to terminal operator     //
                .forEach(System.out::println);
    }
}
