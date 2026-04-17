package com.csrTraining.generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class WithoutGenericsDemo {
    static void main(String[] args) {

        ArrayList al= new ArrayList();
        LinkedList list= new LinkedList();
        LinkedList<Integer> newLi= new LinkedList();
        list.add(547);
        list.add("Deep");
        al.add(54);
        al.add("Deep");
        al.add(true);
        al.add(null);
        System.out.println(list);

    }
}
