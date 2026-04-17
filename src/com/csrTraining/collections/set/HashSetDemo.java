package com.csrTraining.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSetDemo {
    static void main(String[] args) {
        HashSet<String> myset= new HashSet<>();
        myset.add("Deep");
        myset.add("Deep");
        myset.add("Ayush");
        System.out.println("Size of your Set is: "+ myset.size());
        System.out.println();
//        Using Iterator        //
        Iterator<String> iterator= myset.iterator();
        while (iterator.hasNext())
        {
            String name2= iterator.next();
            System.out.println(name2);
        }
        System.out.println();


//        Using For Each Loop       //
        for (String val: myset)
        {
            System.out.println(val);
        }
    }
}
