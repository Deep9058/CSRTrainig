package com.csrTraining.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    static void main(String[] args) {
        Map<Integer,String> treemap= new TreeMap<>();
        treemap.put(23,"Deep");
        treemap.put(28,"Ayush");
        treemap.put(12,"MJ");
        treemap.put(20,"Niharika");
//        System.out.println(treemap);

        for (Map.Entry<Integer,String> entry: treemap.entrySet())
        {
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }

    }
}
