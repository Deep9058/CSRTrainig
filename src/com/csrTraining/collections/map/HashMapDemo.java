package com.csrTraining.collections.map;

import java.util.Date;
import java.util.HashMap;

public class HashMapDemo {
    static void main(String[] args) {
        HashMap<String,String> map= new HashMap<>();
        map.put("Deep","Bareilly");
        map.put("Namjush","Moradabad");
        map.put("Niharika","Noida");
        map.put("MJ","Bareilly");
        map.put(null,null);

        System.out.println(map);
        System.out.println(map.get("Bareilly"));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        map.remove("MJ");
        System.out.println(map.values());
        System.out.println(map.size());
//        System.out.println(map.hashCode());
        long code1= "Deep".hashCode();
        long code2= "Najmush".hashCode();
        long code3= "Niarika".hashCode();
        long code4 = "MJ".hashCode();
        System.out.println(code1);
        System.out.println(code2);
        System.out.println(code3);
        System.out.println(code4);

    }
}
