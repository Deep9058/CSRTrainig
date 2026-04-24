package com.csrTraining.lambda.predefineMethods;

import java.util.function.Function;

public class FunctionDemo {
    static void main(String[] args) {
        String str1="reep";
        Function<String,String> convertStr=(str)-> str.replace('d','r');
        String newstr=convertStr.apply("deep");
        System.out.println(newstr.equals(str1));

        Function<Integer,Integer> doublevalue=(Integer num)->num*2;
        Function<Integer,Integer> addthree=(Integer num)->num+3;

        System.out.println(doublevalue.andThen(addthree).apply(5));     //  13  //
        System.out.println(doublevalue.compose(addthree).apply(5));     //  16  //


    }
}
