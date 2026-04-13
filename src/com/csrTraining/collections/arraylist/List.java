package com.csrTraining.collections.arraylist;

import java.util.ArrayList;

public class List {
    static void main() {
        java.util.List<Integer> li= new ArrayList<Integer>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        li.remove(2);
        li.addFirst(60);

        for (Integer newli : li)
        {
            System.out.print(newli + "   ");
        }
        System.out.println();
        System.out.println("Size of list is : "+li.size());
        li.set(2,264);
        for (Integer newli : li)
        {
            System.out.print(newli + "   ");
        }
    }
}
