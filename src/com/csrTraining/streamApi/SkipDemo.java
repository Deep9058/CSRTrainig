package com.csrTraining.streamApi;

import java.util.stream.Stream;

public class SkipDemo {
    static void main() {
        Stream.iterate(1,n->n+1)
                .skip(5)                         //      skip() method-> skip first given values or element to terminal operator     //
                .limit(10)                  //      limit() method-> limit given values or element to terminal operator     //
                .forEach(System.out::println);      //      forEach() -> for iterate all element    //
    }
}
