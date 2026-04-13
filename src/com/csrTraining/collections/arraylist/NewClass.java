package com.csrTraining.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewClass {
    static void main() {
        List<Students> students= new ArrayList<>();
        students.add(new Students("Deep",101,98));
        students.add(new Students("Ayush",102,90));
        students.add(new Students("Priyanshi",103,92));
        students.add(new Students("Prakhar",104,89));

        System.out.println("Before Sorting students data is : "+ students);
        Collections.sort(students);
        System.out.println("After Sorting:"+ students);


    }
}
