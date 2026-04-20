package com.csrTraining.collections.set;

import java.util.HashSet;

public class HashSetMethodsDemo {
    static void     main(String[] args) {
        HashSet<Integer> set2= new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        HashSet<Integer> set3= new HashSet<>();
        set3.add(3);
        set3.add(4);
        set3.add(5);
        System.out.println(set2.containsAll(set3));     //  containsAll()   //
        set2.addAll(set3);          //  addAll()    //
        System.out.println(set2);
        set2.retainAll(set3);       //  reetainAll()    //
        System.out.println(set2);
        HashSet<Integer> set4= new HashSet<>();
        set4.add(4);
        set4.add(5);
        set2.removeAll(set4);       //  removeAll()    //
        System.out.println(set2);


    }
}
