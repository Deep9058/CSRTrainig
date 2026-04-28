package com.csrTraining.optional;

import java.util.HashSet;
import java.util.Vector;

public class GFG{

    public static void main(String[] args){

        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("c");
        v.add("b");
        System.out.println(v);


        HashSet<String> set= new HashSet<>();
        set.add("Deep");
        set.add("Charu");
        set.add("Bulbul");
        System.out.println(set);
        System.out.println("A".hashCode());
    }
}