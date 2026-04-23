package com.csrTraining.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSetDemo {
    static void main(String[] args) {
        HashSet<String> set1= new HashSet<>();
        set1.add("Deep");
        set1.add("Ayush");
        set1.add("ayush");
        System.out.println("Size of your Set is: "+ set1.size());
        System.out.println();
        System.out.println("Deep".hashCode());

//        Using Iterator        //
        Iterator<String> iterator= set1.iterator();
        while (iterator.hasNext())
        {
            String name2= iterator.next();
            System.out.println(name2);
        }
        System.out.println();


//        Using For Each Loop       //
        for (String val: set1)
        {
            System.out.println(val);
        }
    }
}
