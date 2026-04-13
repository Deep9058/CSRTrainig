package com.csrTraining.collections.linkedlist;

import java.util.LinkedList;

public class BasicsLinkedlist {
    static void main() {
        LinkedList<String> li= new LinkedList<>();
        LinkedList<String> lis= new LinkedList<>();

        li.add("deep");
        li.add("Ayush");
        li.add("Nitin");
        li.add("Tilak");
        li.add("Puneet");
        System.out.println(li);
        System.out.println(li.pollFirst());
        System.out.println(li);
        li.add("Tanisha");
        System.out.println(li);
        System.out.println(li.pop());
        li.push("Gunjan");
        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        li.set(2,"Ram");
        System.out.println(li);
    }
}
