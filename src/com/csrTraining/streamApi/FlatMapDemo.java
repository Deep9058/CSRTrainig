package com.csrTraining.streamApi;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo {
    static void main(String[] args) {
        String[] array= {"Protecons", "Technology"};
        Stream<String> arrayStream= Arrays.stream(array);
        arrayStream.map(word->word.split("")).flatMap(Arrays::stream).forEach(System.out::println);
    }
}
