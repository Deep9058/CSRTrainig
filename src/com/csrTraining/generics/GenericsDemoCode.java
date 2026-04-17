package com.csrTraining.generics;

public class GenericsDemoCode {

    static void main() {
        GenericsPair<String,Integer> pair1= new GenericsPair<>("Ayush",24);
        GenericsPair<String,String> pair2= new GenericsPair<>("Deep","24");
        GenericsPair<Double,Float> pair3= new GenericsPair<>(235.656,5.36f);
        GenericsPair<Integer,Integer> pair4= new GenericsPair<>(584,475);
        pair1.setSecond(25);
        String name=pair1.getFirst();
        String name2=pair2.getFirst();
        int age=pair1.getSecond();
        String pair2age= pair2.getSecond();
        System.out.println(name);
        System.out.println(name2);
        System.out.println(age);
        System.out.println(pair2age);

    }
}
