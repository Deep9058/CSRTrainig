package com.csrTraining.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIteration {
    static void main(String[] args) {

        HashMap<String,String> map= new HashMap<>();
        map.put("Deep","Bareilly");
        map.put("Najmush","Moradabad");
        map.put("Niharika","Noida");
        map.put("MJ","Bareilly");
        map.put(null,null);
        approach1(map);
        System.out.println();
        System.out.println("Using Iterator");
        approach2(map);
        System.out.println();
        System.out.println("Using EntrySet");
        approach3(map);


    }

    public static void approach1(HashMap<String, String> map)
    {
       Set<String> keys= map.keySet();
       for (String key: keys)
       {
           System.out.println(key +": "+ map.get(key));
       }
    }

    public static void approach2(HashMap<String, String> map)
    {

        Set<String> keys= map.keySet();
        Iterator<String> iterator= keys.iterator();
        while (iterator.hasNext())
        {
            String key= iterator.next();
            String value=map.get(key);
            System.out.println(key +": "+ value);
        }

    }
    public static void approach3(HashMap<String, String> map)
    {
        for (Map.Entry<String,String> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
    }
}
