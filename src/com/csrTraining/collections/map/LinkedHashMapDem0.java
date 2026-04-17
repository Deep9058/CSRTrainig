package com.csrTraining.collections.map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDem0 {
    static void main(String[] args) {

        Map<Integer,String> linkedhashmap= new LinkedHashMap<>();
        linkedhashmap.put(25,"Deep");
        linkedhashmap.put(65,"Ayush");
        linkedhashmap.put(12,"Gunjan");
        linkedhashmap.put(20,"Yash");
        System.out.println(linkedhashmap);
        linkedhashmap= Collections.unmodifiableMap(linkedhashmap);

        try {
            linkedhashmap.put(20,"Rohit");
        }

        catch (Exception e)
        {
            System.out.println("This map is unmodifiable. ");
        }
        for (Map.Entry<Integer,String> entry: linkedhashmap.entrySet())
        {
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }


    }
}
