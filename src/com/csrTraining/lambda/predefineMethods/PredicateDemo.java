package com.csrTraining.lambda.predefineMethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    static void main(String[] args) {
        Predicate<Integer> isEven= ( num)-> num%2==0;
        Predicate<Integer> isGreaterthen50= (num)-> num>50;
        System.out.println(isEven.test(16));                   //    true   //
        System.out.println(isEven.test(13));                   //    false  //
        System.out.println(isGreaterthen50.test(54));          //    true   //
        System.out.println(isGreaterthen50.negate().test(54)); //    false  //
        System.out.println(isGreaterthen50.test(45));          //    false  //
        System.out.println(isEven.or(isGreaterthen50).test(51));     //    true   //
        System.out.println(isEven.and(isGreaterthen50).test(51));    //    false   //

        Predicate<Integer> isOdd= Predicate.not(isEven);
        System.out.println(isOdd.test(45));                 //    true   //

        Predicate<String> checkEquality= Predicate.isEqual("Deep");
        System.out.println(checkEquality.test("Deepak"));   //    false   //

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list.stream().filter(isEven).collect(Collectors.toList()));  //  [2, 4, 6, 8, 10]    //
    }
}
