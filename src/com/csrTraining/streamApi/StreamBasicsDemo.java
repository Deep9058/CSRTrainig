package com.csrTraining.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasicsDemo {
    static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Supply");
        list.add("HR");
        list.add("Sales");
        list.add("Development");
        list.add("Testing");

        Stream<String> depString= list.stream();        //  ForEach() loop  //
        depString.forEach(System.out::println);
        System.out.println();

        Stream<String> inStream= Stream.of("Deep","Ayush","Niharika");    //     .of() method   //
        inStream.forEach(System.out::println);
        System.out.println();

        Stream<String> depString2= list.stream().parallel();    //  Parallel method //
        depString2.forEach(System.out::println);
        System.out.println();


        String[] array={"One","Two","Three","Four"};    //  Creating Stream using Array //
        Stream<String> newArray = Arrays.stream(array);
        newArray.forEach(System.out::println);

    }
}
