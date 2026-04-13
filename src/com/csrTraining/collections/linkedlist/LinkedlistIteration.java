package com.csrTraining.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistIteration {
    static void main() {
        LinkedList<String> list= new LinkedList<>();
        list.add("deep");
        list.add("Ayush");
        list.add("Nitin");
        list.add("Tilak");
        list.add("Puneet");

//        for (String name: list)
//        {
//            System.out.println(name);
//        }


        //  Using Iterator   //
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext())
        {
            String name2= iterator.next();
            System.out.println(name2);
        }
        System.out.println();

        //  Using ListIterator   //
        ListIterator<String> listIterator=list.listIterator();
        while (listIterator.hasNext())
        {
            String name3=listIterator.next();
            System.out.println(name3);
        }
        System.out.println();
        while (listIterator.hasPrevious())
        {
            String name3=listIterator.previous();
            System.out.println(name3);
        }
    }
}
