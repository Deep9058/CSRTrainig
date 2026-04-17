package com.csrTraining.Exercises;
import java.util.List;
import java.util.ArrayList;

public class Exercise42 {
    public static List createMixedList() {

        ArrayList al= new ArrayList();
        al.add("Hello");
        al.add(123);
        al.add(3.14);
        al.add(true);

        System.out.println(al);
        return al;
    }

    static void main() {
        createMixedList();
    }
}
