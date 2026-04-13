package com.csrTraining.collections.linkedlist;

import java.util.*;

public class LinkedListSortingDemo {
    static void main() {
        List<Integer> numbers= new LinkedList<>();
        numbers.add(20);
        numbers.add(65);
        numbers.add(54);
        numbers.add(98);
        numbers.add(264);
        numbers.add(150);
        numbers.add(845);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

    }
}
